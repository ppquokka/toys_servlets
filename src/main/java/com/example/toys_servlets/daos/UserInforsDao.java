package com.example.toys_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.study_servlets.controlls.commons.Commons;

public class UserInforsDao {
  
    public ArrayList<HashMap<String, String>> selectAll() {
        ArrayList<HashMap<String, String>> userInforList = new ArrayList<>();
        try {
            Common commons = new Common();
            Statement statement = commons.getStatement();
           
            String query = "SELECT * FROM db-toysservlet.user;";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                HashMap<String, String> userInforRecord = new HashMap<>();
                userInforRecord.put("USER", resultSet.getString("USER"));
                userInforRecord.put("USER_LOGINID", resultSet.getString("USER_LOGINID"));
                userInforList.add(userInforRecord);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userInforList;
    }

    public ArrayList<HashMap<String, String>> selectWithSearch(String search) {
        // 이 부분은 구현해야 할 내용입니다.
        return null;
    }

    public int SeleteWithUniqueID(String unique_id) {
        return 0;
    }
}