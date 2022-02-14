package com.fullstack.learnersacademy.repository;

import com.fullstack.learnersacademy.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
