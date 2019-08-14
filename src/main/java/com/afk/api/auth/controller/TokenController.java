package com.afk.api.auth.controller;

import com.afk.api.auth.entity.SessionToken;
import com.afk.api.auth.service.TokenService;
import com.afk.api.auth.vo.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * Created by @author fuxj on 2019-7-18 13:43
 */
@RestController
@RequestMapping("/api")
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public ResponseMessage token(SessionToken token) {
        String uuid = UUID.randomUUID().toString();
        token.setToken(uuid);
        token.setCreateTime(new Date());
        SessionToken sessionToken = tokenService.save(token);
        if (sessionToken != null) {
            return ResponseMessage.success(sessionToken.getToken(), HttpStatus.CREATED);
        } else {
            return ResponseMessage.failed("生成token失败，请重试！", HttpStatus.BAD_REQUEST);
        }
    }
}
