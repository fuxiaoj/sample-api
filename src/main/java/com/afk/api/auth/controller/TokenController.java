package com.afk.api.auth.controller;

import com.afk.api.auth.entity.SysToken;
import com.afk.api.auth.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by @author fuxj on 2019-7-18 13:43
 */
@RestController
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @RequestMapping(method = RequestMethod.POST, value = "token")
    @ResponseStatus(HttpStatus.CREATED)
    public SysToken token(HashMap data) {
        String uuid = UUID.randomUUID().toString();
        SysToken token = new SysToken();
        token.setToken(uuid);
        tokenService.save(token);
        return token;
    }
}
