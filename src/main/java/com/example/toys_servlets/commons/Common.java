package com.example.toys_servlets.commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Common {
     public String generateUUID() {
     return UUID.randomUUID().toString();
     }

<<<<<<< HEAD:src/main/java/com/example/toys_servlets/commons/Commons.java
public class Commons {
    // public String generateUUID() {
    //     return UUID.randomUUID().toString();
    // }   


public Statement getStatement(){
        String url = "jdbc:mysql://192.168.0.41:3306/DB_TOYSSERVLET";
=======
    public Statement getStatement() {
        String url = "jdbc:mysql://192.168.0.41:8080/db_toysservlet";
>>>>>>> c347ad5920654bf7206db98d6643bd265119c9ba:src/main/java/com/example/toys_servlets/commons/Common.java
        String user = "DB_TOYSSERVLET";
        String password = "!YOJULAB*";

        Statement statement = null;
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        return statement;
    }

    public String getGeneratorID() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyyhh:mm:ss");
        String strDate = formatter.format(date);
        return strDate;
    }
}