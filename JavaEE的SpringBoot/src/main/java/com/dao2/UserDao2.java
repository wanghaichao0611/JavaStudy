package com.dao2;

import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao2 extends JpaRepository<User,Integer> {
}
