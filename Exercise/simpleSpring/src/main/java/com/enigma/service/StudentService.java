package com.enigma.service;

import com.enigma.contansta.Constanta;
import com.enigma.dao.StudentDao;
import com.enigma.model.Student;

public class StudentService {
   StudentDao studentDao;

    public StudentService() {

    }

    public Integer countMale(){
        int count =0;
        for (Student student: studentDao.getAll() ) {
            if (student.getGender().equals(Constanta.MALE)){
                count++;
            }
        }
        return count;
    }

    public void setStudentDao(StudentDao studentDao) {

        this.studentDao = studentDao;
    }
}
