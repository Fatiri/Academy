package CRUD;

import java.sql.*;

public class Select {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection
                             ("jdbc:postgresql://127.0.0.1:5432/school","postgres","01031995");

            Statement stateMent = con.createStatement();
            ResultSet resultSet = stateMent.executeQuery("select * from student");

            for (int i = 0; true ; i++) {
                if (resultSet.next()){
                    System.out.println(resultSet.getString("name")+" | "+resultSet.getString("gender")+
                            " | "+ resultSet.getString("major")+" | "+ resultSet.getString("birth_Date"));
                    System.out.println("-------------------------------------------");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
