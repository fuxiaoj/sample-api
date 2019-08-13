package com.afk.api.auth.service;

import com.afk.api.auth.entity.User;

import java.util.List;

/**
 * Created by @author fuxj on 2019-7-18 11:16
 */
public interface UserService {

    List<User> list();

    User save(User user);

    User update(Integer id, User user);

    User getUserById(Integer id);

    void delete(Integer id);

}
