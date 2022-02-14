package com.fullstack.learnersacademy.repository;


import com.fullstack.learnersacademy.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SubjectRepostory extends JpaRepository<Subject, Integer> {
}
