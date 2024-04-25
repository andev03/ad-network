package com.adcompany.AD_Telecom.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails an = User.withUsername("0123456789")
                .password("{noop}123")
                .build();
        return new InMemoryUserDetailsManager(an);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.httpBasic(Customizer.withDefaults()).sessionManagement(httpSecuritySessionManagementConfigurer ->
                        httpSecuritySessionManagementConfigurer
                                .sessionCreationPolicy(SessionCreationPolicy.ALWAYS))
                .authorizeHttpRequests(configurer ->
                        configurer
                                .requestMatchers("/", "/services/**", "/coming_soon").permitAll()
                                .requestMatchers("/css/**", "js/**", "/img/**").permitAll()
                                .anyRequest()
                                .authenticated()
                )
                .formLogin(form ->
                        form
                                .loginPage("/login")
                                .loginProcessingUrl("/loginCustomer")//form send data
                                .defaultSuccessUrl("/")// url forward if the data is true
                                .failureUrl("/login?error") // url forward if the data is false
                                .permitAll()
                ).formLogin(form ->
                        form
                                .loginPage("/login")
                                .loginProcessingUrl("/loginCustomer")
                )
                .logout(logout ->
                        logout.logoutUrl("/logout")
                                .logoutSuccessUrl("/")
                                .permitAll()
                                .deleteCookies("JSESSIONID")
                )
        ;
        return http.build();
    }
}
