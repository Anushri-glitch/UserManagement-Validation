package com.Shrishti.UserManageValidation.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String UserId;

    @NotEmpty(message = "Not Suitable UserName")
    @Pattern(regexp = "^[A-Za-z]\\w{5,29}$")
    private String UserName;

    @NotEmpty(message = "Please make sure this DOB is correct")
    @Pattern(regexp = "^(1[0-2]|0[1-9])-(3[01]" + "|[12][0-9]|0[1-9])-[0-9]{4}$")
    private String DOB;

    @NotEmpty
    @Email(message = "Email is not correct")
    private String Email;

    @NotEmpty(message = "Phone Number is empty")
    @Size(min = 10, max = 12)
    //@Pattern(regexp = "^\\d{12}$") //Normal 12 digit phoneNumber validation regex
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$")
    private String Phone;


    private String Date;
    private String Time;
}
