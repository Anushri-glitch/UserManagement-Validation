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

    public User getUserById(String userId){
        List<User> newUserList = userRepository.getAllUsers();

        for(User user : newUserList){
            if(user.getUserId().equalsIgnoreCase(userId)){
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

    public String updateUser(String userId, User newUser){
        List<User> newUserList = userRepository.getAllUsers();

        for(User user : newUserList){
            if(user.getUserId().equalsIgnoreCase(userId)){
                userRepository.remove(userId);
                userRepository.save(newUser);
            }
        }
        return "user Updated!!!";
    }

    public String deleteUser(String userId){
        boolean deleted = false;
        deleted = userRepository.remove(userId);
        if(deleted){
            return "User Deleted!!!";
        }
        return "There is no user exist related to this Id!!!";
    }


}
