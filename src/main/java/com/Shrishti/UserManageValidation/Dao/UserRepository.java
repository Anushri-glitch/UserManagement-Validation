package com.Shrishti.UserManageValidation.Dao;

import com.Shrishti.UserManageValidation.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> UserList;

    public UserRepository() {
        UserList = new ArrayList<>();
    }

    public List<User> getAllUsers(){
        return UserList;
    }

    public void save(User user){
        UserList.add(user);
    }

    public boolean remove(String id){
        for(User user : UserList){
            if(user.getUserId().equals(id)){
                UserList.remove(user);
                return true;
            }
        }
        return false;
    }
}
