// 회원관리, 설문하기, 설문통계 OptionInforsJSPServlet,OptionInforsDeleteServlet 두가지 활용

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

import com.example.study_servlets.daos.OptionInforsDao;
import com.example.toys_servlets.daos.UserInforsDao;


@WebServlet(urlPatterns = "/userInforsJSPServlet")
public class userInforsJSPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String search = request.getParameter("search");

            UserInforsDao userInforsDao = new UserInforsDao();
            ArrayList userInforList = new ArrayList<>();
            userInforList = userInforsDao.selectWithSearch(search);

           request.setAttribute("search", search);
            request.setAttribute("userInforList", userInforList);

            // getWriter 전에 charset 하기
            response.setContentType("text/html;charset=UTF-8");

            // 다음 파일 호출
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/cars/option_infors.jsp");
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


    

