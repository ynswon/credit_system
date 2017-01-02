package com.funda.login;

/**
 * Created by wonjun-pc on 2016-06-27.
 */

import java.util.ArrayList;
import java.util.List;

import com.funda.controller.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class CustomAuthenticationProvider implements AuthenticationProvider {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {

        String user_id = (String)authentication.getPrincipal();
        String user_pw = (String)authentication.getCredentials();


        logger.info("사용자가 입력한 로그인정보입니다. {}", user_id + "/" + user_pw);

        if(user_id.equals("admin")&&user_pw.equals("funda!@#")){
            logger.info("정상 로그인입니다.");
            List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
            roles.add(new SimpleGrantedAuthority("ROLE_USER"));

            UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(user_id, user_pw, roles);
            result.setDetails(new CustomUserDetails(user_id, user_pw));
            return result;
        }else{
            logger.info("사용자 크리덴셜 정보가 틀립니다. 에러가 발생합니다.");
            throw new BadCredentialsException("Bad credentials");
        }


    }
}