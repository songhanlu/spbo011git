package com.example.demo.service;

import com.example.demo.Spbo011Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hp on 2018/2/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Spbo011Application.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void save10Users() throws Exception {
        userService.save10Users();
    }

}