package cl.maui.poslogMaui.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import cl.maui.poslogMaui.exception.OracleCustomException;
import cl.maui.poslogMaui.rest.RestConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Slf4j
@Service
public class OCITokenService {

	private final RestConfig restConfig;

	@Value("${app.oci.token.authenticationUrl}")
	private String url;

	@Value("${app.oci.token.grantType}")
	private String grantType;

	@Value("${app.oci.token.scope}")
	private String scope;
	@Value("${app.auth.token.username}")
	private String username;
	@Value("${app.auth.token.password}")
	private String password;

	public String getToken() throws OracleCustomException {
		String authHeader = username + ":" + password;
		String encodedAuth = Base64.getEncoder().encodeToString(authHeader.getBytes(StandardCharsets.UTF_8));HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);headers.add("Authorization", "Basic " + encodedAuth);

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("grant_type", grantType);
		map.add("scope", scope);

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		ResponseEntity<String> response;

		try {
			response = restConfig.restTemplate().postForEntity(url, request, String.class);
		} catch (Exception e) {
			//log.error("Failed to retrieve access token", e);
			throw new OracleCustomException("Failed to retrieve access token", e);
		}

		if (!response.getStatusCode().is2xxSuccessful()) {
			//log.error("Failed to retrieve access token. HTTP error code: " + response.getStatusCode());
			throw new OracleCustomException("Failed to retrieve access token. HTTP error code: " + response.getStatusCode());
		}

		String responseBody = response.getBody();
		if (responseBody == null || responseBody.trim().isEmpty()) {
			//log.error("The response body is empty");
			throw new OracleCustomException("The response body is empty");
		}

		String accessToken = getTokenAsString(responseBody);

		if (accessToken == null || accessToken.trim().isEmpty()) {
			throw new OracleCustomException("The accessToken is empty");
		}

		return accessToken;

	}

	private static String getTokenAsString(String responseBody) {
		JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
		return jsonObject.get("access_token").getAsString();
	}

	public OCITokenService(RestConfig restConfig) {
		this.restConfig = restConfig;
	}
}
