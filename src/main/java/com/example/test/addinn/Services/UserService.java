package com.example.test.addinn.Services;


import com.example.test.addinn.Models.UserModel;
import com.example.test.addinn.Repositories.UserRepositories;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepositories userRepositories ;


    public UserModel addUser(UserModel a1) {

       return  userRepositories.save(a1);

    }
    public List<UserModel> getAllUser(){
        return userRepositories.findAll();
    }
    public Optional<UserModel> getUserById(Long id){
         return userRepositories.findById(id);
    }
    public UserModel updateUser(UserModel a1) throws Exception {
        Optional<UserModel> a = userRepositories.findById(a1.getId_user());
        if(a.isPresent()){
            a1 = addUser(a1);
        }else {
            throw new Exception("user not found");
        }
        return a1;

    }
    public void deleteUser(UserModel a){
        userRepositories.delete(a);
    }
}
