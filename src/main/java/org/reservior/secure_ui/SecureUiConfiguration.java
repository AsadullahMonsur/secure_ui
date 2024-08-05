package org.reservior.secure_ui;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecureUiConfiguration {
    @Value("${server.http.port}")
    private int http_port;

    //logging.level.root=DEBUG
    //server.address=192.168.22.36
    //server.ssl.client-auth=need

    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> cookieProcessorCustomizer() {
        return (TomcatServletWebServerFactory factory) -> {
            final Connector connector = new Connector();
            connector.setPort(http_port);
            factory.addAdditionalTomcatConnectors(connector);
        };
    }
}
