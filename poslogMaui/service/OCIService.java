package cl.maui.poslogMaui.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cl.maui.poslogMaui.exception.OracleCustomException;
import cl.maui.poslogMaui.rest.RestConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class OCIService {

    private final OCITokenService ociTokenService;
    private final RestConfig restConfig;

    public String ociIntegrationHandler(String request, String oicUrl) throws OracleCustomException {
        String token = ociTokenService.getToken();
        if (!token.isEmpty()) {
            try {
                //log.info("calling OCI: ");
                return callExternalAPI(token, request, oicUrl);
            } catch (Exception e) {
                throw new OracleCustomException("Failed to call OCI : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            throw new OracleCustomException("Failed to obtain token from OCI.", HttpStatus.UNAUTHORIZED);
        }
    }

    public String callExternalAPI(String token, String xml, String url) throws Exception {

        HttpHeaders headers = buildHeader(token);
        //xml = buildRequest(xml);
        HttpEntity<String> request = new HttpEntity<>(xml, headers);

        ResponseEntity<String> response;

        try {
            response = restConfig.restTemplate().postForEntity(url, request, String.class);
        } catch (Exception e) {
            throw new OracleCustomException(e.getMessage());
        }

        if (!response.getStatusCode().is2xxSuccessful()) {
            throw new OracleCustomException("Failed to retrieve access token. HTTP error code: " + response.getStatusCode());
        }

        String responseBody = response.getBody();
        if (responseBody == null || responseBody.trim().isEmpty()) {
            throw new OracleCustomException("The response body is empty");
        }

        return responseBody;

    }

	@Deprecated
	private String buildRequest(String xml) throws JsonProcessingException {
		xml = xml.replace("\r", "").replace("\n", "");
		Map<String, String> body = new HashMap<>();
		body.put("xml", xml);
		ObjectMapper objectMapper = new ObjectMapper();

		return objectMapper.writeValueAsString(body);
	}

    private static HttpHeaders buildHeader(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);
        return headers;
    }

    public OCIService(OCITokenService ociTokenService, RestConfig restConfig) {
        this.ociTokenService = ociTokenService;
        this.restConfig = restConfig;
    }
}
