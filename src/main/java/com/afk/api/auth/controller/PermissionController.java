package com.afk.api.auth.controller;

import com.afk.api.auth.entity.SysPermission;
import com.afk.api.auth.service.PermissionService;
import com.afk.api.auth.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by @author fuxj on 2019-7-18 13:38
 */
@RestController
@RequestMapping("permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @RequestMapping(method = RequestMethod.POST, value = "list")
    public JsonResult list() {
        List<SysPermission> list = permissionService.list();
        return JsonResult.build(list);
    }
}
