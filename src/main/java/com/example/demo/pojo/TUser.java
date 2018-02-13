package com.example.demo.pojo;

import javax.persistence.*;

/**
 * Created by hp on 2018/2/12.
 */
@Entity
public class TUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ003")
    @SequenceGenerator(name = "SEQ003",sequenceName = "SEQ003",allocationSize = 1)
    private Long u_id;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "TUser{" +
                "u_id=" + u_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
