package com.nielsen.confirmit.config;

import com.nielsen.confirmit.exceptionHandler.SoapClientInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

@Configuration
public class ConfirmItConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.nielsen.confirmit.webservices");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller jaxb2Marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(jaxb2Marshaller);
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller);
        webServiceTemplate.setDefaultUri("http://cftest1.nielsenwebsurveys.com/confirmit/webservices/current");
        webServiceTemplate.setInterceptors(new ClientInterceptor[]{soapClientInterceptor()});
        webServiceTemplate.setCheckConnectionForFault(false);
        webServiceTemplate.setCheckConnectionForError(false);
        return webServiceTemplate;
    }

    @Bean
    public SoapClientInterceptor soapClientInterceptor() {
        return new SoapClientInterceptor();
    }
}
