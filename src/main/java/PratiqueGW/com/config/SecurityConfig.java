package PratiqueGW.com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity // 웹보안 활성화
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable() // csrf 공격을 막기 위해 state 값을 전달 받지 않는다
                .formLogin() // 기본 제공하는 로그인 화면 사용
                .and()
                .httpBasic(); // http 통신으로 basic auth를 사용 할 수 있다. (ex: Authorization: Basic bzFbdGfmZrptWY30YQ==)
    }

}
