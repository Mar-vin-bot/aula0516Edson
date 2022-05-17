package com.exercicio.leilao.Security;

import org.aspectj.weaver.ast.And;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean

    public SecurityFilterChain securityfilterchain (HttpSecurity http) throws Exception{
        http 
                .authorizeHttpRequests().antMatchers(...anPattnes:"/h2-console/**")
                .and()
    } 

}
