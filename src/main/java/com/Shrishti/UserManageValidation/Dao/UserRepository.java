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
        UserList.add(new User("0", "Anu", "05-12-2000", "Anu@1234", "+918081009534", "23-12-2023", "12:00"));
    }

    public List<User> getAllUsers(){
        return UserList;
    }

    public boolean save(User user){
        UserList.add(user);
        return true;
    }

    public boolean remove(String userId){
        for(User user : UserList){
            if(user.getUserId().equalsIgnoreCase(userId)){
                UserList.remove(user);
                return true;
            }
        }
        return false;
    }
}
