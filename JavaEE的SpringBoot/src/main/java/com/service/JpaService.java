package com.service;

import com.Book.Jpa;
import com.Mapper.Mapper1.JpaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaService {
    @Autowired
    JpaDao jpaDao;
    public void addJpa(Jpa jpa){
        jpaDao.save(jpa);
    }
    public Page<Jpa> getBookByPage(Pageable pageable){
        return jpaDao.findAll(pageable);
    }
    public List<Jpa> getJpasByAuthorStartingWith(String author){
        return jpaDao.getJpasByAuthorStartingWith(author);
    }
    public  List<Jpa>  getJpasByPriceGreaterThan(Float price){
        return jpaDao.getJpasByPriceGreaterThan(price);
    }
    public Jpa getMaxIdJpa(){
        return jpaDao.getMaxIdJpa();
    }
    public List<Jpa> getJpasByIdAndAuthor( String author, Integer id){
        return jpaDao.getJpasByIdAndAuthor(author,id);
    }
    public List<Jpa> getJpasByIdAndName (String name,Integer id){
        return jpaDao.getJpasByIdAndName(name,id);
    }
}
