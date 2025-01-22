package com.GNP.FoliosGNP.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception {
        http

                .csrf(csrf->csrf.disable())
                .cors().and()
                .authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET).permitAll()
                .requestMatchers(HttpMethod.POST).permitAll()
                .requestMatchers(HttpMethod.PUT).permitAll()
                .requestMatchers(HttpMethod.DELETE).permitAll()
                .anyRequest()
//                .permitAll();
                .authenticated()
                .and()
                .httpBasic();
        return http.build();
    }

}
