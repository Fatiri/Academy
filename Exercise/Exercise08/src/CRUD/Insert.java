package CRUD;

import java.sql.*;

public class Insert {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection
                    ("jdbc:postgresql://127.0.0.1:5432/school", "postgres", "01031995");

            Integer id = 13;
            String name = "Maman Abdul";
            String geneder = "L";
            String major = "Akuntansi";

            Statement stateMent = con.createStatement();
            String resultSet = "insert into student (id, name, gender, major) values(" + id + ",'" + name + "','" + geneder + "','" + major + "')";
            stateMent.execute(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
