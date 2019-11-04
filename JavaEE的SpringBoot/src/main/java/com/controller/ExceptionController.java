package com.controller;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(AuthorizationException.class)
    public ModelAndView error(AuthorizationException  e){
        ModelAndView view=new ModelAndView("unauthorized");
        view.addObject("error",e.getMessage());
        return view;
    }
}
