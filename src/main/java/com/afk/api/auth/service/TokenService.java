package com.afk.api.auth.service;

import com.afk.api.auth.entity.SysToken;

/**
 * Created by @author fuxj on 2019-7-18 13:52
 */
public interface TokenService {

    SysToken getByToken(String token);

    void save(SysToken token);
}
