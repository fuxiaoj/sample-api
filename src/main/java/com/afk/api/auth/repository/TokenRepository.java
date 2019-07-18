package com.afk.api.auth.repository;

import com.afk.api.auth.entity.SysToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by @author fuxj on 2019-7-18 13:53
 */
public interface TokenRepository extends JpaRepository<SysToken, Integer> {

    @Query(value = "select * from sys_token where token = ?1 ", nativeQuery = true)
    SysToken getByToken(String token);
}
