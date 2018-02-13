package com.example.demo.dao;

import com.example.demo.pojo.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hp on 2018/2/12.
 */
public interface UserDao extends JpaRepository<TUser,Long> {
}
