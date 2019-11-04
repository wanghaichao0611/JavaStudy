package com.whc.cloud.Controller;

import com.whc.cloud.Dao.UserRepositoryTwo;
import com.whc.cloud.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepositoryTwo userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne=this.userRepository.findOne(id);
        return findOne;
    }
}
