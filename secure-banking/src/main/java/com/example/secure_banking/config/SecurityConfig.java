package com.example.securebanking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // H2 console के लिए CSRF disable
                .headers(headers -> headers.frameOptions(frame -> frame.disable())) // H2 console frame allow
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll() // H2 console allow
                        .anyRequest().authenticated()
                )
                .formLogin(); // default login page

        return http.build();
    }
}
