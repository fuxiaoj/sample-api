package com.afk.api.auth.service.impl;

import com.afk.api.auth.entity.SysUser;
import com.afk.api.auth.repository.UserRepository;
import com.afk.api.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @author fuxj on 2019-7-18 11:16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(SysUser user) {
        userRepository.save(user);
    }

    @Override
    public void update(SysUser user) {
        userRepository.save(user);
    }

    @Override
    public SysUser getUserById(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public void delete(SysUser user) {
        userRepository.delete(user);
    }

    @Override
    public List<SysUser> list() {
        return userRepository.findAll();
    }
}
