package com.afk.api.auth.service;

import com.afk.api.auth.entity.SysUser;

import java.util.List;

/**
 * Created by @author fuxj on 2019-7-18 11:16
 */
public interface UserService {

    List<SysUser> list();

    void save(SysUser user);

    void update(SysUser user);

    SysUser getUserById(int id);

    void delete(SysUser user);

}
