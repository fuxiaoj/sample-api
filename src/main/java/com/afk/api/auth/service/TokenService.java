package com.afk.api.auth.service;

import com.afk.api.auth.entity.SessionToken;

/**
 * Created by @author fuxj on 2019-7-18 13:52
 */
public interface TokenService {

    SessionToken getByToken(String token);

    SessionToken save(SessionToken token);
}
