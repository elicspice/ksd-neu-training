package com.kingland.neusoft.course.controller;

import com.kingland.neusoft.course.mapper.dao.UserModel;
import com.kingland.neusoft.course.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * The user information related rest api controller
 *
 * @author KSC
 */
@RestController
public class UserController {

    private final UserService userService;

    /**
     * Initialize controller with user service bean
     *
     * @param userService service implementation bean
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Api for creating user
     *
     * @param userModel creating user
     * @return created user record
     */
    @PostMapping("/user")
    public UserModel addUser(@RequestBody UserModel userModel) {
        return userService.addUser(userModel);
    }

}
