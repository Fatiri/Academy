package com.enigma.controller;

import com.enigma.model.Student;
import com.enigma.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class StudentController {
   Logger logger = Logger.getLogger(StudentController.class.toString());

   @Autowired
    StudentService studentService;

    @RequestMapping("studentList")
    public String goToStudent(){
        logger.log(Level.INFO, "Lewat");
    return "studentList";
    }

    @GetMapping("student")
    public  String gettostudent1(){
        return "student";
    }


    @PostMapping("/student-submit")
    public String gotWhatEver(@RequestParam String id, @RequestParam String name, ModelMap model){

        Student student = new Student();
        student.setId(Integer.parseInt(id));
        student.setName(name);
        logger.log(Level.INFO, "Lewat");
        studentService.save(student);
        model.addAttribute("kirim",studentService.getStudents());

        return "student";

    }
}
