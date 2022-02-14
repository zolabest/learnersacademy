package com.fullstack.learnersacademy.controller;

import com.fullstack.learnersacademy.exception.BusinessException;
import com.fullstack.learnersacademy.model.Student;

import com.fullstack.learnersacademy.service.LearnersAcademy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    LearnersAcademy learnersAcademy;

    @GetMapping("/students")
    public String  getAllStudents(Model model) throws BusinessException {
        List<Student> studentList = learnersAcademy.allStudents();
        model.addAttribute("Students", studentList);
        return "viewStudent";
    }
    @GetMapping("/studentdetails")
    public String  displayStudents() throws BusinessException {
        return "studentdetails";
    }



    @PostMapping("/students")
    public String addStudent(@ModelAttribute Student student, Model model) throws BusinessException {
        learnersAcademy.addStudent(student);

        return "redirect:/students";
    }

    @GetMapping("/updatestudents")
    public String updateStudent(@RequestParam("studentId") Integer studentId,
                                @RequestParam("studentName") String studentName,
                                @RequestParam("studentDoB") String dateTime,
                                @RequestParam("classId") Integer classId,Model model) throws BusinessException {
        Student student = new Student();
        student.setStudentName(studentName);
        student.setStudentDob( dateTime);
        student.setStudentId(studentId);
        student.setClassId(classId);

        learnersAcademy.updateStudent(student,studentId);

      return "redirect:/students";
    }

    @GetMapping("/deletestudents")
    public String deleteStudent(@RequestParam("studentId") Integer studentId, Model model) throws BusinessException {
        learnersAcademy.deleteStudent(studentId);

        return "redirect:/students";
    }

}