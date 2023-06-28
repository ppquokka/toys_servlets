// 회원관리, 설문하기, 설문통계 OptionInforsJSPServlet,OptionInforsDeleteServlet 두가지 활용

package com.example.toys_servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toys_servlets.daos.UserInforsDao;

@WebServlet(urlPatterns = "/userInforsJSPServlet")
public class UserInforsJSPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String search = request.getParameter("search");

            UserInforsDao userInforsDao = new UserInforsDao();
            ArrayList<HashMap<String, String>> userInforList = userInforsDao.SelectWithSearch(search);

            request.setAttribute("search", search);
            request.setAttribute("userInforList", userInforList);

            // 다음 파일(jsp) 호출
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/survey/membersInformation.jsp");
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
