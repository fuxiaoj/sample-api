package com.afk.api.auth.entity;

import javax.persistence.*;

/**
 * Created by @author fuxj on 2019-7-18 13:48
 */
@Entity
@Table(name="sys_token")
public class SysToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String token;

    public SysToken() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
