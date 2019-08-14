package com.afk.api.config;

import com.afk.api.auth.entity.SessionToken;
import com.afk.api.auth.service.TokenService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by @author fuxj on 2019-7-18 14:01
 */
public class SecurityFilter extends HandlerInterceptorAdapter {

    private static final Logger log = LoggerFactory.getLogger(SecurityFilter.class);

    @Autowired
    private TokenService tokenService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("request请求地址path[{}] uri[{}]", request.getServletPath(), request.getRequestURI());
        String token = request.getHeader("Authorization");
        if (StringUtils.isBlank(token)) {
            throw new RuntimeException("请填写令牌！");
        }
        SessionToken sessionToken = tokenService.getByToken(token);
        if (sessionToken == null) {
            throw new RuntimeException("令牌出错，请重新获取！");
        }
        return super.preHandle(request, response, handler);
    }

}
