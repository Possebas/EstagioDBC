package com.br.dbccompany.trabalhofinal.Security;

import com.br.dbccompany.trabalhofinal.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("userDetailsService")
    UsuarioService usuarioService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
        .disable()
        .authorizeRequests()
        .antMatchers(HttpMethod.POST, "/login").permitAll() // login permitido
        .antMatchers(HttpMethod.POST, "/usuario/**").permitAll()
        .anyRequest().authenticated()
        .and()
        .addFilterAfter(new JWTLoginFilter("/login", authenticationManager()), UsernamePasswordAuthenticationFilter.class)
        .addFilterAfter(new JWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);

//        .antMatchers(HttpMethod.GET, "/api/seguradora").permitAll() 
//        .antMatchers("/api/pais").permitAll() 
//        .anyRequest().authenticated() 
//        .anyRequest().permitAll(); 
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService( usuarioService )
                .passwordEncoder( encoder() );
    }

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder(6);
    }
}
