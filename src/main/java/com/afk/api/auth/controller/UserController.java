package com.afk.api.auth.controller;

import com.afk.api.auth.entity.SysUser;
import com.afk.api.auth.service.UserService;
import com.afk.api.auth.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by @author fuxj on 2019-7-17 15:45
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "list")
    public JsonResult list() {
        List<SysUser> list = userService.list();
        return JsonResult.build(list);
    }

    @RequestMapping(method = RequestMethod.POST, value = "save")
    public JsonResult save(SysUser user) {
        userService.save(user);
        return JsonResult.build();
    }

    @RequestMapping(method = RequestMethod.POST, value = "update")
    public JsonResult update(SysUser user) {
        userService.update(user);
        return JsonResult.build();
    }

    @RequestMapping(method = RequestMethod.POST, value = "delete")
    public JsonResult delete(int id) {
        SysUser user = userService.getUserById(id);
        if(user == null) {
            return JsonResult.failed("未找到用户信息，无法删除");
        }
        userService.delete(user);
        return JsonResult.build();
    }
}
