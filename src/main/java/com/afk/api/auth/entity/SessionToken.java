package com.afk.api.auth.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by @author fuxj on 2019-7-18 13:48
 */
@Entity
@Table(name="session_token")
public class SessionToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String token;

    @Column(name = "create_time")
    private Date createTime;

    public SessionToken() {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
