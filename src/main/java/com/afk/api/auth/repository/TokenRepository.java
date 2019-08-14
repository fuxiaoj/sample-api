package com.afk.api.auth.repository;

import com.afk.api.auth.entity.SessionToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by @author fuxj on 2019-7-18 13:53
 */
public interface TokenRepository extends JpaRepository<SessionToken, Integer> {

    @Query(value = "select * from session_token where token = ?1 ", nativeQuery = true)
    SessionToken getByToken(String token);
}
