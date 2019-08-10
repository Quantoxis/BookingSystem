/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem2;

import java.sql.*;     // Use classes in java.sql package

public class SQL {    // Save as "JdbcUpdateTest.java"

    {

        try (
            //create an object to connect to database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3036/equipmentdb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "myuser", "xxxx");
            //create a statement object to send SQL to the mySQL db
            Statement statement = connection.createStatement();) {
            //execute  a SQL SELECT query 
            String stringSelect = "select os from laptop";
            ResultSet resultSet = statement.executeQuery(stringSelect);

            int rowCount = 0;
            //moves cursor to next row or returns false if reached end
            while (resultSet.next()) {
                String os = resultSet.getString("os");

                System.out.println(os);
                ++rowCount;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
