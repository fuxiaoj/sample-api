package com.afk.api.auth.service.impl;

import com.afk.api.auth.entity.SessionToken;
import com.afk.api.auth.repository.TokenRepository;
import com.afk.api.auth.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by @author fuxj on 2019-7-18 13:53
 */
@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    @Override
    public SessionToken getByToken(String token) {
        return tokenRepository.getByToken(token);
    }

    @Override
    public SessionToken save(SessionToken token) {
        return tokenRepository.save(token);
    }
}
