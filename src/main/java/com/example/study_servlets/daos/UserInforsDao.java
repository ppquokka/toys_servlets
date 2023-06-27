package com.example.study_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.study_servlets.controlls.commons.Commons;


public class UserInforsDao {
    public int DeleteWithUniqueID(String unique_id){
        int count = 0;
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement(); // Editor in Workbanch
            String query = <<<<
            count = statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public ArrayList SelectWithSearch(String search) {
        ArrayList UserInforList = new ArrayList<>();
        try {
            if(search == null){
                search = "";
            }
            Commons commons = new Commons();
            Statement statement = commons.getStatement(); // Editor in Workbanch
            String query = <<<<
            ResultSet resultSet = statement.executeQuery(query);

            HashMap userInforRecord = new HashMap<>();
            while (resultSet.next()) {
                userInforRecord = new HashMap<>();
                userInforRecord.put("OPTION_INFOR_ID", resultSet.getString("OPTION_INFOR_ID"));
                userInforRecord.put("OPTION_NAME", resultSet.getString("OPTION_NAME"));

                userInforList.add(userInforRecord);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userInforList;
    }
}