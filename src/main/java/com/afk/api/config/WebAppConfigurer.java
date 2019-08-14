package com.afk.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by @author fuxj on 2019-7-18 14:03
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Bean
    public SecurityFilter getSecurityFilter() {
        return new SecurityFilter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getSecurityFilter()).addPathPatterns("/**")
                .excludePathPatterns("/api/token", "/**.html", "/webjars/**", "/swagger-resources/**");
    }
}
