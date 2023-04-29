package com.Shrishti.UserManageValidation.Service;

import com.Shrishti.UserManageValidation.Dao.UserRepository;
import com.Shrishti.UserManageValidation.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public User getUserById(String id){
        List<User> newUserList = userRepository.getAllUsers();

        for(User user : newUserList){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public String saveUser(User user){
        boolean insertionStatus = userRepository.save(user);//in our case...always true
        if(insertionStatus)
        {
            return "User added successfully!!!!!";
        }
        else
        {
            return "Failed!!!!!....User Not Added!!!";

        }
    }

    public String updateUser(String id, User newUser){
        List<User> newUserList = userRepository.getAllUsers();

        for(User user : newUserList){
            if(user.getUserId().equals(id)){
                userRepository.save(newUser);
            }
        }
        return "user Updated!!!";
    }

    public String deleteUser(String id){
        boolean deleted = false;
        deleted = userRepository.remove(id);
        if(deleted){
            return "User Deleted!!!";
        }
        return "There is no user exist related to this Id!!!";
    }


}
