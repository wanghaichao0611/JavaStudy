package com.controller;

import com.validation.User;
import com.validation.ValidationGroup2;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Validated表示这里的校验使用ValidationGroup2分组的校验规则
@RestController
public class ValidationGroupController {
    @PostMapping("/user3")
    public List<String> addUser(@Validated(ValidationGroup2.class)User user,BindingResult result){
        List<String> errors=new ArrayList<String>();
        if (result.hasErrors()){
            List<ObjectError> allErrors=result.getAllErrors();
            for (ObjectError error: allErrors){
                errors.add(error.getDefaultMessage());
            }
        }
        return errors;
    }
}
