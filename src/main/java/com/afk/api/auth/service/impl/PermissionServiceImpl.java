package com.afk.api.auth.service.impl;

import com.afk.api.auth.entity.SysPermission;
import com.afk.api.auth.repository.PermissionServiceRepository;
import com.afk.api.auth.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @author fuxj on 2019-7-18 13:39
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionServiceRepository permissionServiceRepository;

    @Override
    public List<SysPermission> list() {
        return permissionServiceRepository.findAll();
    }
}
