package com.enigma.service;

import com.enigma.connection.DBConnection;
import com.enigma.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentService {


    public static void create(Student student) {
        List<Student> students = new ArrayList<>();
        Connection connection = DBConnection.letsCreateConnection();

        try {
            Statement statement = connection.createStatement();
            statement.execute("insert into student (id, name, birth_place,birth_date,gender)values " +
                    "(" + student.getId() + "," +
                    "'" + student.getName() + "'" + ","
                    + "'" + student.getBirthPlace() + "'"
                    + "," + "'" + student.getBirthDate() + "'"
                    + "," + "'" + student.getGender() + "')");

            Statement statement2 = connection.createStatement();
            ResultSet resultSet = statement2.executeQuery("select * from student where id = '" + student.getId() + "'");

            for (int i = 0; true; i++) {
                if (resultSet.next()) {
                    System.out.println("-------------------------------------------");
                    System.out.println(resultSet.getString("id") + " | "+resultSet.getString("name") + " | " + resultSet.getString("birth_Place") +
                            " | " + resultSet.getString("birth_Date") + " | " + resultSet.getString("gender"));
                    System.out.println("-------------------------------------------");

//                    students.add(new Student(resultSet.getInt("id"),
//                            resultSet.getString("name"),
//                            resultSet.getString("birth_place"),
//                            resultSet.getString("birth_date"),
//                            resultSet.getString("gender"))
//                    );

                }else{
                    break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Student>searchStudent(String students) throws SQLException {
        List<Student> student = new ArrayList<>();
        Connection connection = DBConnection.letsCreateConnection();
        Statement statement2 = connection.createStatement();
        ResultSet resultSet = statement2.executeQuery("select * from student where name like '%" +students+ "%'");

        for (int i = 0; true; i++) {
            if (resultSet.next()) {
                student.add(new Student(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("birth_place"),
                        resultSet.getDate("birth_date"),
                        resultSet.getString("gender")));

            }else {
                break;
            }
        }
        return student;
    }

    public static List<Student> getAll() throws SQLException {
        List<Student> student = new ArrayList<>();
        Connection connection = DBConnection.letsCreateConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student");


        for (int i = 0; true; i++) {
            if (resultSet.next()) {
                student.add(new Student(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("birth_place"),
                        resultSet.getDate("birth_date"),
                        resultSet.getString("gender")));
            } else {
                break;
            }
        }
        return student;
    }

    public static void getCount() throws SQLException {
        Connection connection = DBConnection.letsCreateConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet =statement.executeQuery("select sum(id) from student");

        resultSet.getString("id");
    }
}

