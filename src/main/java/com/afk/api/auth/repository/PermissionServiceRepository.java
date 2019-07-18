package com.afk.api.auth.repository;

import com.afk.api.auth.entity.SysPermission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by @author fuxj on 2019-7-18 13:39
 */
public interface PermissionServiceRepository extends JpaRepository<SysPermission, Integer> {
}
