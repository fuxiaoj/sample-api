package com.afk.api.auth.service.impl;

import com.afk.api.auth.entity.User;
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
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(Integer id, User user) {
        User currentInstance = getUserById(id);
        // 排除不更新字段、待写
        return userRepository.save(currentInstance);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
