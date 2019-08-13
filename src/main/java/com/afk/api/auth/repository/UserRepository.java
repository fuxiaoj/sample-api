package com.afk.api.auth.repository;

import com.afk.api.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by @author fuxj on 2019-7-18 11:36
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
