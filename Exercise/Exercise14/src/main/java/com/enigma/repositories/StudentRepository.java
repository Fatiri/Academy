package com.enigma.repositories;

import com.enigma.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
// sebagai repository , knapa kosong ? karena student repository mengextends JpaRepositry jadi semua methode yg ada di JpaRepositories di miliki oles studentRepositroy
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
