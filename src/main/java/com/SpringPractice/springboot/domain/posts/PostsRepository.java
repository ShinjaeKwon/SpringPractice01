package com.SpringPractice.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long>{
    //Entity클래스와 기본 Entity Repository는 함께 위치해야 한다.
    //Entity클래스는 기본 Repository없이는 제대로 역할 수행이 불가능하다.

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
