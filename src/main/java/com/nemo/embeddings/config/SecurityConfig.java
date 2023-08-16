package com.nemo.embeddings.config;

import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@KeycloakConfiguration
public abstract class SecurityConfig extends KeycloakWebSecurityConfigurerAdapter
{

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            super.configure(http);
            http.authorizeRequests()
                    .antMatchers("/").authenticated()
                    .anyRequest().permitAll();
        }
    }


