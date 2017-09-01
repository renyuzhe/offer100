package com.offer100.controller;

import com.offer100.domain.User;
import com.offer100.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by ren on 2017/9/1.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    private User addUser(@RequestParam("userName") String userName,
                         @RequestParam("passWord")String passWord) {
        User user = new User(userName, passWord);

        return userRepository.save(user);
    }
}
