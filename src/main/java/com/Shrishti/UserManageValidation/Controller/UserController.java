package com.Shrishti.UserManageValidation.Controller;

import com.Shrishti.UserManageValidation.Model.User;
import com.Shrishti.UserManageValidation.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //Get All User
    @GetMapping(value = "/getAllUsers")
    public List<User> GetAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/getUserById/{userId}", method = RequestMethod.GET)
    public User getUserById(@PathVariable String userId){
        return userService.getUserById(userId);
    }

    @PostMapping(value = "/addUser")
    public String saveUser(@Valid @RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping(value = "/updateUser/id/{userId}")
    public String updateUser(@PathVariable String userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }

    @DeleteMapping(value = "/deleteUser/id/{userId}")
    public String deleteUser(@PathVariable String userId){
        return userService.deleteUser(userId);
    }


}
