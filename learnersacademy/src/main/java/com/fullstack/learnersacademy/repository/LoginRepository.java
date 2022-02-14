package com.fullstack.learnersacademy.repository;
import com.fullstack.learnersacademy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginRepository extends JpaRepository<User, Integer> {

    public User findByUsername(String username);



}
