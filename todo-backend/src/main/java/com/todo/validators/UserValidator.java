package com.todo.validators;

import org.springframework.util.StringUtils;

import com.todo.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class UserValidator {
    
	public static boolean isValidEmailAddress(String email) {
		   boolean result = true;
		   try {
		      InternetAddress emailAddr = new InternetAddress(email);
		      emailAddr.validate();
		   } catch (AddressException ex) {
		      result = false;
		   }
		   return result;
		}
    public static List<String> validateUser(UserDto user) {
        List<String> errors = new ArrayList<>();
        if (user == null) {
            errors.add("Please fill the First name");
            errors.add("Please fill the Last name");
            errors.add("Please fill the User name");
            errors.add("Please fill the user Email");
            errors.add("Please fill the User Password");
            return errors;
        }

        if (StringUtils.isEmpty(user.getFirstName())) {
            errors.add("Please fill the First name");
        }
        if (StringUtils.isEmpty(user.getLastName())) {
            errors.add("Please fill the Last name");
        }
        if (StringUtils.isEmpty(user.getUserName())) {
            errors.add("Please fill the User name");
        }
        
		if (StringUtils.isEmpty(user.getEmail())) {
            errors.add("Please fill the user Email");
        }else if ( !isValidEmailAddress(user.getEmail()) ) {
        	
        	errors.add("Your email address is invalid. Please enter a valid address like : example@example.com");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            errors.add("Please fill the User Password");
        }

        return errors;
    }

    public static List<String> validateUserCredentials(String email, String password) {
        List<String> errors = new ArrayList<>();
        if (StringUtils.isEmpty(email))  {
            errors.add("Email is empty");
        }
        if(!isValidEmailAddress(email)){
        	errors.add("Your email address is invalid. Please enter a valid address like : example@example.com");
        }
        if (StringUtils.isEmpty(password)) {
            errors.add("Password is empty");
        }
        return errors;
    }
}
