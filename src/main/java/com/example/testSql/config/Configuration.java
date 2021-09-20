package com.example.testSql.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class Configuration  extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //  for database  configurations
        auth.jdbcAuthentication();س



        //  Set the user password and the roles I need
        // Also you need @Bean for passwordEncoder

        auth.inMemoryAuthentication()
                .withUser("mohamed")
                .password("password")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("password")
                .roles("ADMIN")
        ;
    }

    @Bean
    public PasswordEncoder  getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }



    //  for handle  request of different api
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user").hasRole("USER")  //  if admin login open websites
                .antMatchers("/admin").hasAnyRole("ADMIN")  //  if admin login open websites
                .antMatchers("/").permitAll()
                .and()
                .formLogin();
    }
}
