package com.afk.api.auth.controller;

import com.afk.api.auth.entity.User;
import com.afk.api.auth.service.UserService;
import com.afk.api.auth.vo.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by @author fuxj on 2019-7-17 15:45
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseMessage list() {
        List<User> list = userService.list();
        if(list != null) {
            return ResponseMessage.success(list, HttpStatus.OK);
        } else {
            return ResponseMessage.failed("无用户信息", HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping
    public ResponseMessage save(@RequestBody User user) {
        User currentInstance = userService.save(user);
        return ResponseMessage.success(currentInstance, HttpStatus.CREATED);
    }

    @PutMapping(value = "{id}")
    public User update(@PathVariable("id") Integer id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable("id") Integer id) {
        userService.delete(id);
    }
}
