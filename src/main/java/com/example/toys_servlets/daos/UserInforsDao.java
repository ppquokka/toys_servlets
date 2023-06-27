package com.example.toys_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.study_servlets.controlls.commons.Commons;

public class UserInforsDao {

    public ArrayList<HashMap<String, String>> selectWithSearch(String search) {
        ArrayList<HashMap<String, String>> userInforList = new ArrayList<>();
        try {
            if (search == null) {
                search = "\"delete from user_information\\n" + //
                        "\" + //\r\n" + //
                         "where PW_ID ;\";"; 
            }
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT *\n" +
                    "FROM option_infors\n" +
                    "WHERE OPTION_NAME LIKE '" + search + "%';";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                HashMap<String, String> userInforRecord = new HashMap<>();
                userInforRecord.put("USER_ID", resultSet.getString("USER_ID"));
                userInforRecord.put("USER_INFORMATION_CODE", resultSet.getString("USER_INFORMATION_CODE"));
                userInforList.add(userInforRecord);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userInforList;
    }
}