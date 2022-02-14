package com.fullstack.learnersacademy.repository;


import com.fullstack.learnersacademy.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
