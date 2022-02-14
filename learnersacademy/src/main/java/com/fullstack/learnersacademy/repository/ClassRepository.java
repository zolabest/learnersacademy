package com.fullstack.learnersacademy.repository;

import com.fullstack.learnersacademy.model.ClassDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClassRepository extends JpaRepository<ClassDetails, Integer> {
}
