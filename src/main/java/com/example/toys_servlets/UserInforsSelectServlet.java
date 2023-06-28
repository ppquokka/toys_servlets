package com.example.toys_servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.toys_servlets.daos.UserInforsDao;

@WebServlet(urlPatterns = "/UserInforsSelectServlet ")
public class UserInforsSelectServlet  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String unique_id = request.getParameter("unique_id");

            UserInforsDao userInforsDao = new UserInforsDao();
            int count = userInforsDao.DeleteWithUniqueID(unique_id);

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            String contents = "Delete count : "+count;
            printWriter.println(contents);
            printWriter.close();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}