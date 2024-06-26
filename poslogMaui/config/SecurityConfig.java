package cl.maui.poslogMaui.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class SecurityConfig extends GenericFilterBean {


	@Value("${app.soap.usernamemaui}")
	private String validUsername;

	@Value("${app.soap.passwordmaui}")
	private String validPassword;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String authHeader = httpRequest.getHeader("Authorization");
		System.out.println("Filtro chamado para URL: " + httpRequest.getRequestURL());
		if (authHeader != null && authHeader.startsWith("Basic ")) {
			// Decode the auth header
			String base64Credentials = authHeader.substring("Basic ".length()).trim();
			byte[] credDecoded = Base64Utils.decodeFromString(base64Credentials);
			String credentials = new String(credDecoded, StandardCharsets.UTF_8);

			// credentials = username:password
			final String[] values = credentials.split(":", 2);

			if (values.length == 2 && values[0].equals(validUsername) && values[1].equals(validPassword)) {
				chain.doFilter(request, response);
				return;
			}
		}

		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		httpResponse.setHeader("WWW-Authenticate", "Basic realm=\"Access to the SOAP API\", charset=\"UTF-8\"");
		httpResponse.getWriter().write("HTTP Status 401 - " + "Unauthorized");
	}

}
