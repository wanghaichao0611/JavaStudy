package com.Mapper.Mapper1;

import com.Book.Jpa;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface JpaDao extends JpaRepository<Jpa,Integer> {
    List<Jpa>  getJpasByAuthorStartingWith(String author);
    List<Jpa>  getJpasByPriceGreaterThan(Float price);
    @Query(value ="select * from t_book where id=(select max(id) from t_book)",nativeQuery = true)
    Jpa getMaxIdJpa();
    @Query("select b from t_book b where b.id>:id and b.author=:author")
    List<Jpa> getJpasByIdAndAuthor(@Param("author") String author,@Param("id") Integer id);
    @Query("select b from t_book b where b.id<?2 and b.name like %?1%")
    List<Jpa> getJpasByIdAndName(String name,Integer id);
}
