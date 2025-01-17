package com.lcwd.user.service.controllers;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
    User user1 =  userService.saveUser(user);
    return new ResponseEntity<>(user1,HttpStatus.CREATED);
    }

    //single user get
    @GetMapping("/{userId}")
    public ResponseEntity <User> getSingleUser(@PathVariable String userId){
        User user = userService.getUser(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }


    //all user get
    @GetMapping
    public ResponseEntity<List<User>> getAllUSer(){
        List<User> allUser = userService.getAllUser();
        return new ResponseEntity<>(allUser,HttpStatus.OK);
    }

}
