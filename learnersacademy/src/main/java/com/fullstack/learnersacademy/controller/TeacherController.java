package com.fullstack.learnersacademy.controller;

import com.fullstack.learnersacademy.exception.BusinessException;
import com.fullstack.learnersacademy.model.Student;
import com.fullstack.learnersacademy.model.Teacher;
import com.fullstack.learnersacademy.service.LearnersAcademy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    LearnersAcademy learnersAcademy;

    @GetMapping("/teachers")
    public String getAllTeachers(Model model) throws BusinessException {
        List<Teacher> teacherList = learnersAcademy.allTeachers();
        model.addAttribute("Teachers", teacherList);
        return "viewTeacher";

    }
    @GetMapping("/teacherdetails")
    public String  displayTeachers() throws BusinessException {
        return "teacherdetails";
    }



    @PostMapping("/teachers")
    public String addStudent(@ModelAttribute Teacher teacher, Model model) throws BusinessException {
        learnersAcademy.addTeacher(teacher);
        return "redirect:/teachers";
    }



    @GetMapping("/updateteachers")
    public String updateStudent(@RequestParam("teacherId") Integer teacherId,
                                @RequestParam("teacherName") String teacherName,
                                @RequestParam("teacherCategory") String teacherCategory,
                                @RequestParam("experience") Integer experience,Model model) throws BusinessException {
        Teacher teacher = new Teacher();
        teacher.setTeacherId(teacherId);
        teacher.setTeacherName( teacherName);
        teacher.setTeacherCategory(teacherCategory);
        teacher.setExperience(experience);

        learnersAcademy.updateTeacher(teacher,teacherId);

        return "redirect:/teachers";
    }

    @GetMapping("/deleteteachers")
    public String deleteTeacher(@RequestParam("teacherId") Integer teacherId, Model model) throws BusinessException {
        learnersAcademy.deleteTeacher(teacherId);
        return "redirect:/teachers";
    }

}

