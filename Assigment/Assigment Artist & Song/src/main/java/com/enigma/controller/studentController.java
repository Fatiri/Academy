package com.enigma.controller;

import com.enigma.entity.Student;
import com.enigma.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller  // bean controler
public class studentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public ModelAndView toStudentView() {

        return new ModelAndView("student-form", "student", new Student());
    }

    @PostMapping("/student")
    public String toStudentForm(@ModelAttribute("student") Student student, Model model) {

        studentRepository.save(student); // menyimpan model ke repository
        List<Student> students = studentRepository.findAll(); // mencari data model yg ada dalam list

        model.addAttribute("x", student);
        model.addAttribute("studentList", students); //mengadd  students object variable dan di beri alias studentList
        return "student-view";
    }


//
//    @GetMapping("/student")
//    public String toStudentView(){
//        return "student-form";
//    }
//
//    @PostMapping("/student")
//    public String toStudentForm(@RequestParam Integer id, @RequestParam String name, Model model){
//        Student student = new Student(id, name);
//        model.addAttribute("x", student);
//        return "student-view";
//    }

//    @GetMapping("/student")
//    public String goToStudent(){
//        System.out.println("test");
//        return "student/student-view.html";
//    }
//
//    @GetMapping("/student-form")
//    public String toStudentForm(){
//        System.out.println("duarrrr");
//        return "student/student-form.html";
//    }
}
