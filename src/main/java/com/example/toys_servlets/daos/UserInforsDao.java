package com.example.toys_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.toys_servlets.commons.Common;

public class UserInforsDao {
    private ArrayList<HashMap<String, String>> userInforList; // userInforList 필드 선언 및 초기화

    public int DeleteWithUniqueID(String unique_id){
        int count = 0;
        try {
            Common common = new Common();
            Statement statement = common.getStatement();
           
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
        return count;
    }
  
    public ArrayList<HashMap<String, String>> SelectWithSearch(String search) {
        ArrayList<HashMap<String, String>> optionInforList = new ArrayList<>();
        try {
            if(search == null){
                search = "";
            }
            Common common = new Common();
            Statement statement = common.getStatement();
            if (statement != null) { // statement가 null이 아닌지 확인
                String query = "SELECT USER, USER_LOGINID, PW \n" +
                        "FROM user\n" +
                        "INNER JOIN user_information ON user.USER_ID=user_information.USER_ID\n" +
                        "INNER JOIN pw ON pw.PW_ID=user_information.PW_ID ;";
                ResultSet resultSet = statement.executeQuery(query);
                
                while (resultSet.next()) {
                    HashMap<String, String> userInforRecord = new HashMap<>(); // userInforRecord 객체 생성
                    userInforRecord.put("USER", resultSet.getString("USER"));
                    userInforRecord.put("USER_LOGINID", resultSet.getString("USER_LOGINID"));
                    userInforList.add(userInforRecord);
                }
            } else {
                // statement가 null인 경우에 대한 처리 로직
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
        return userInforList;
    }
}