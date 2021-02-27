package com.example.test.addinn.Controllers;


import com.example.test.addinn.Models.UserModel;
import com.example.test.addinn.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService UserServ ;



    @PostMapping("/newUser")
    public ResponseEntity<UserModel> addUser(@Validated @RequestBody UserModel a1)
    {
        a1 = UserServ.addUser(a1);
        return new ResponseEntity<UserModel>(a1, HttpStatus.CREATED);
    }

    //Select User
    @GetMapping("/all")
    public ResponseEntity<List<UserModel>> getUsers()
    {
        List<UserModel> a = UserServ.getAllUser();
        return new ResponseEntity<List<UserModel>>(a, HttpStatus.OK);

    }

    //Delete User by id
    @DeleteMapping("/UserSupp")
    public ResponseEntity deleteUser(@Validated  @RequestBody UserModel a1)
    {
        UserServ.deleteUser(a1);
        return new ResponseEntity<>(a1, HttpStatus.CREATED);
    }

    //Update User by id
    @PutMapping("/User/{code}")
    public ResponseEntity<UserModel> updateUser(@PathVariable Long code,@Validated  @RequestBody UserModel a1) throws Exception {
       UserServ.updateUser(a1);
       return new ResponseEntity<UserModel>(a1, HttpStatus.CREATED);
    }

    // find User by id
    @GetMapping("/User/{code}")
    public ResponseEntity<UserModel> getUser (@PathVariable Long code)
    {
        UserServ.getUserById(code);
        return new ResponseEntity<UserModel>( HttpStatus.CREATED);
    }
}