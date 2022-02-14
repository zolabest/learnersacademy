package com.fullstack.learnersacademy.controller;

import com.fullstack.learnersacademy.exception.BusinessException;
import com.fullstack.learnersacademy.model.ClassDetails;

import com.fullstack.learnersacademy.model.Student;
import com.fullstack.learnersacademy.service.LearnersAcademy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClassController {

    @Autowired
    LearnersAcademy learnersAcademy;

    @GetMapping("/classes")
    public String  getAllClasses(Model model) throws BusinessException {
        List<ClassDetails> classDetails = learnersAcademy.allClasses();
        model.addAttribute("ClassDetails", classDetails);
        return "viewClass";
    }
    @GetMapping("/classdetails")
    public String  displayClasses() throws BusinessException {
        return "classdetails";
    }


    @PostMapping("/addclasses")
    public String addClass(@ModelAttribute ClassDetails classDetails, Model model) throws BusinessException {
        learnersAcademy.addClass(classDetails);
        return "redirect:/classes";
    }



    @GetMapping("/updateclasses")
    public String updateClass(@RequestParam("classId") Integer classId,
                                @RequestParam("standard") Integer standard,
                                @RequestParam("division") String division,
                                Model model) throws BusinessException {
        ClassDetails classDetails  = new ClassDetails();
        classDetails.setClassId(classId);
        classDetails.setStandard( standard);
        classDetails.setDivision(division);

        learnersAcademy.updateClass(classDetails,classId);
        return "redirect:/classes";
    }

    @GetMapping("/deleteclasses")
    public String deleteClass(@RequestParam("classId") Integer classId, Model model) throws BusinessException {
        learnersAcademy.deleteClass(classId);

        return "redirect:/classes";
    }
}
