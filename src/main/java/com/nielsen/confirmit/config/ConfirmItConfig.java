package com.nielsen.confirmit.config;

import com.nielsen.confirmit.exceptionHandler.DetailSoapFaultDefinitionExceptionResolver;
import com.nielsen.confirmit.exceptionHandler.ServiceFaultException;
import com.nielsen.confirmit.exceptionHandler.SoapClientInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.soap.server.endpoint.SoapFaultDefinition;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

import java.util.Properties;

@EnableWs
@Configuration
public class ConfirmItConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.nielsen.confirmit.webservices");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller());
        webServiceTemplate.setUnmarshaller(marshaller());
        webServiceTemplate.setDefaultUri("http://cftest1.nielsenwebsurveys.com/confirmit/webservices/current");
//	    webServiceTemplate.setInterceptors(new ClientInterceptor[]{wsSecurityInterceptor()});
//        webServiceTemplate.setInterceptors(new ClientInterceptor[]{soapClientInterceptor()});
        webServiceTemplate.setCheckConnectionForFault(false);
        webServiceTemplate.setCheckConnectionForError(false);
        return webServiceTemplate;
    }

//    @Bean
//    public Wss4jSecurityInterceptor wsSecurityInterceptor() {
//        Wss4jSecurityInterceptor  wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
//        wss4jSecurityInterceptor.setSecurementActions(WSHandlerConstants.TIMESTAMP + " " + WSHandlerConstants.USERNAME_TOKEN);
//        wss4jSecurityInterceptor.setSecurementPasswordType(WSConstants.PW_TEXT);
//        wss4jSecurityInterceptor.setSecurementUsername("Testuser8");
//        wss4jSecurityInterceptor.setSecurementPassword("July@2015");
//        return wss4jSecurityInterceptor;
//    }
//
    @Bean
    public SoapFaultMappingExceptionResolver exceptionResolver() {
        SoapFaultMappingExceptionResolver exceptionResolver = new DetailSoapFaultDefinitionExceptionResolver();

        SoapFaultDefinition faultDefinition = new SoapFaultDefinition();
        faultDefinition.setFaultCode(SoapFaultDefinition.SERVER);
        exceptionResolver.setDefaultFault(faultDefinition);

        Properties errorMappings = new Properties();
        errorMappings.setProperty(Exception.class.getName(), SoapFaultDefinition.SERVER.toString());
        errorMappings.setProperty(ServiceFaultException.class.getName(), SoapFaultDefinition.SERVER.toString());
        exceptionResolver.setExceptionMappings(errorMappings);
        exceptionResolver.setOrder(1);
        return exceptionResolver;
    }

//    @Bean
//    public SoapClientInterceptor soapClientInterceptor() {
//        return new SoapClientInterceptor();
//    }
}
