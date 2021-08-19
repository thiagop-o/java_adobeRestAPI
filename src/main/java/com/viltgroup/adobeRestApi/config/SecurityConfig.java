package com.viltgroup.adobeRestApi.config;

import org.springframework.boot.autoconfigure.security.oauth2.authserver.OAuth2AuthorizationServerConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@Import(OAuth2AuthorizationServerConfiguration.class)
public class SecurityConfig {

}
