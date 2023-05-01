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
![Screenshot (761)](https://user-images.githubusercontent.com/47708011/235440664-5418cae6-ce02-441d-b08c-813e22478f33.png)

#### :purple_square: GET API (For All Users) : http://localhost:8080/getAllUsers
![Screenshot (762)](https://user-images.githubusercontent.com/47708011/235440805-0a888932-f5f7-42f9-8d1d-dbeba14f043b.png)

#### :purple_square: GET API (User BY ID) : http://localhost:8080/getUserById
![Screenshot (763)](https://user-images.githubusercontent.com/47708011/235441053-0d8df3ef-c091-44d6-ac7e-1172b2006b6b.png)

#### :purple_square: PUT API : http://localhost:8080/updateUser/id/{userId}
![Screenshot (764)](https://user-images.githubusercontent.com/47708011/235441844-77390b5e-1f7c-4226-a25c-5510d5634d91.png)
![Screenshot (766)](https://user-images.githubusercontent.com/47708011/235441941-628423de-d12c-4f33-91e5-43bb5c577ab1.png)

#### :purple_square: DELETE API : http://localhost:8080/updateUser/id/{userId}
![Screenshot (767)](https://user-images.githubusercontent.com/47708011/235442893-e5c959d8-1e0e-4fd4-b9df-b7551947b746.png)

----------------------------------------------------------------------------------------------------------------------------------------------------------
