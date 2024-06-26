package cl.maui.poslogMaui.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import javax.servlet.DispatcherType;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

	@Value("${spring.profiles.active:Unknown}")
	private String activeProfile;

	@Bean
	ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {

		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}

	@Bean(name = "poslog")
	SimpleWsdl11Definition defaultWsdl11Definition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		if ("Unknown".equalsIgnoreCase(activeProfile)) {
			wsdl11Definition.setWsdl(new ClassPathResource("PoslogObjReceiverApiService.wsdl"));
		} else {
			wsdl11Definition.setWsdl(new ClassPathResource("PoslogObjReceiverApiService-" + activeProfile + ".wsdl"));
		}
		return wsdl11Definition;
	}


	@Bean(name = "PoslogObjReceiverApiService_schema1")
	XsdSchema posLogReceiveSchema() {
		return new SimpleXsdSchema(new ClassPathResource("PoslogObjReceiverApiService_schema1.xsd"));
	}

	@Bean (name = "PoslogObj_Extensions" )
	XsdSchema posLogExtensionSchema() {
		return new SimpleXsdSchema(new ClassPathResource("PoslogObj_Extensions.xsd"));
	}

	@Bean
	public FilterRegistrationBean<SecurityConfig> loggingFilter(SecurityConfig securityConfig) {
		FilterRegistrationBean<SecurityConfig> registrationBean = new FilterRegistrationBean<>(securityConfig);
		registrationBean.addUrlPatterns("/ws/poslog");
		registrationBean.setDispatcherTypes(DispatcherType.REQUEST);  // Only apply to REQUEST
		registrationBean.setOrder(1);  // Ensure it has a high precedence
		return registrationBean;
	}

}
