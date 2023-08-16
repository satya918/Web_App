package com.Montek.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Montek.Entities.Student;


public interface studentRepository extends JpaRepository<Student, Long> {

}
