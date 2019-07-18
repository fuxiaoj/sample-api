package com.afk.api.auth.service;

import com.afk.api.auth.entity.SysPermission;

import java.util.List;

/**
 * Created by @author fuxj on 2019-7-18 13:39
 */
public interface PermissionService {

    List<SysPermission> list();
}
