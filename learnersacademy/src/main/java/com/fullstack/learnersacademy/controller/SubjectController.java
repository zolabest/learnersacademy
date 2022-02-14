package com.fullstack.learnersacademy.controller;

import com.fullstack.learnersacademy.exception.BusinessException;

import com.fullstack.learnersacademy.model.Student;
import com.fullstack.learnersacademy.model.Subject;
import com.fullstack.learnersacademy.service.LearnersAcademy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SubjectController {


    @Autowired
    LearnersAcademy learnersAcademy;

    @GetMapping("/subjects")
    public String  getAllSubjects(Model model) throws BusinessException {
        List<Subject> subjectList = learnersAcademy.allSubjects();
        model.addAttribute("Subjects", subjectList);
        return "viewSubject";
    }
    @GetMapping("/subjectdetails")
    public String  displaySubjects() throws BusinessException {
        return "subjectdetails";
    }



    @PostMapping("/subjects")
    public String addSubject(@ModelAttribute Subject subject, Model model) throws BusinessException {
        learnersAcademy.addSubject(subject);

        return "redirect:/subjects";
    }

    @GetMapping("/updatesubjects")
    public String updateStudent(@RequestParam("subjectId") Integer subjectId,
                                @RequestParam("subName") String subName,
                                @RequestParam("subLang") String subLang,
                                @RequestParam("teacherId") Integer teacherId,
                                @RequestParam("classId") Integer classId,Model model) throws BusinessException {
        Subject subject = new Subject();
        subject.setSubjectId(subjectId);
        subject.setSubName( subName);
        subject.setSubLang(subLang);
        subject.setClassId(classId);
        subject.setTeacherId(teacherId);

        learnersAcademy.updateSubject(subject,subjectId);

        return "redirect:/subjects";
    }

    @GetMapping("/deletesubjects")
    public String deleteSubject(@RequestParam("subjectId") Integer subjectId, Model model) throws BusinessException {
        learnersAcademy.deleteSubject(subjectId);

        return "redirect:/subjects";
    }

}
