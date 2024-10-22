package com.example.shop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //CSRF 기능 켜기
    @Bean
    public CsrfTokenRepository csrfTokenRepository() {
        HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
        repository.setHeaderName("X-XSRF-TOKEN");
        return repository;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //http.csrf((csrf) -> csrf.disable()); // csrf기능 끄기
        http.csrf(csrf -> csrf.csrfTokenRepository(csrfTokenRepository())
                .ignoringRequestMatchers("/login","/logout","/delete")// login페이지만 csrf기능 끄고 나머진 켜기
        );
        http.authorizeHttpRequests((authorize) ->
                authorize.requestMatchers("/login","/register").anonymous()//로그인 하지 않은 사용자만 접속 가능
                        .requestMatchers("/mypage", "/itemAdd", "/edit", "/write").authenticated()//로그인 한 사용자만 접근 가능
                        .requestMatchers("/**").permitAll()//그 외 모든 요청 허용
        );
        //로그인
        http.formLogin((formLogin)
                -> formLogin.loginPage("/login") // 로그인 할때 사용할 페이지
                .defaultSuccessUrl("/list/page/1") //로그인 성공시 이동할uel
                .failureUrl("/fail") // 로그인 실패시 이동할 url
                .permitAll()
        );
        //로그아웃
        http.logout(logout ->
                logout.logoutUrl("/logout")           // 로그아웃 요청 처리 URL
                        .invalidateHttpSession(true)    // 로그아웃 시 세션 무효화
                        .deleteCookies("JSESSIONID")    // 로그아웃 시 쿠키 삭제
                        .logoutSuccessUrl("/login?logout") // 로그아웃 성공 후 이동할 URL
        );
        return http.build();
    }
}
