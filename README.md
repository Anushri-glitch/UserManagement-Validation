# UserManagement-Validation
##### :purple_square: Its a API Based Web Application
## :one: Frameworks and Languages Used -
    1. SpringBoot
    2. JAVA
    3. Postman
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## :two: Dataflow (Functions Used In)
### :purple_square: 1. Model - Model is used to Iniitialize the required attributes and create the accessable constructors and methods
#### :o: User.java
```java
package com.Shrishti.UserManageValidation.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String UserId;
    private String UserName;
    private String dob;
    private String email;
    private String phone;
    private String date;
    private String time;
}
```

##### To See Model
:white_check_mark: [UserManagement-Validation-Model](https://github.com/Anushri-glitch/UserManagement-Validation/tree/master/src/main/java/com/Shrishti/UserManageValidation/Model)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

### :purple_square: 2. Service - This Layer is used to write the logic of our CRUD operaions in RestroService.java
#### :o: UserService.java
```java
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
}
```

#### To See Service
:white_check_mark: [User-Service](https://github.com/Anushri-glitch/UserManagement-Validation/blob/master/src/main/java/com/Shrishti/UserManageValidation/Service/UserService.java)
----------------------------------------------------------------------------------------------------------------------------------------------------

### :purple_square: 3. Controller - This Controller is used to like UI between Model and Service and also for CRUD Mappings in RestroController.java
#### :o: UserController.java
```java
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
}
```

#### To See Controller
:white_check_mark: [User-Controller](https://github.com/Anushri-glitch/UserManagement-Validation/tree/master/src/main/java/com/Shrishti/UserManageValidation/Controller)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## :three: DataStructures Used in Project
    1. ArrayList
-------------------------------------------------------------------------------------------------------------------------------------------------------
## :four: Project Summary
### :o: Project result 
#### :purple_square: POST API : http://localhost:8080/addUser


#### :purple_square: GET API (For All Restaurent) : http://localhost:8080/api/restro-app/findAll-restaurent

#### :purple_square: PUT API (For All Restaurent) : http://localhost:8080/api/restro-app/update-restaurent/number/{number}

#### :purple_square: PUT API (For All Restaurent) : http://localhost:8080/api/restro-app/delete-restaurent/number/1001
----------------------------------------------------------------------------------------------------------------------------------------------------------
