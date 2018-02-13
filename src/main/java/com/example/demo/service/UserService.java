package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hp on 2018/2/12.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @org.springframework.transaction.annotation.Transactional
    public void save10Users(){
        for (int i = 0; i < 10; i ++) {
            TUser user = new TUser();
            user.setUsername("sss"+i);
            user.setPassword("123456");
            if(i == 5){
                int a = i/0;
            }
            userDao.save(user);
        }
    }
}
