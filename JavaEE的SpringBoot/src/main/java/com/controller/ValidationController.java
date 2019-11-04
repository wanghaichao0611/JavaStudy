package com.controller;


import com.validation.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ValidationController {
    @PostMapping("/user2")
    public List<String> addUser(@PathVariable User user, BindingResult result){
        List<String> errors=new ArrayList<String>();
        if (result.hasErrors()){
            List<ObjectError> allErrors=result.getAllErrors();
            for (ObjectError error:allErrors){
                errors.add(error.getDefaultMessage());
            }
        }
        return errors;
    }
}
