package com.example.toys_servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("LoginServlet - doGet()");
try {
    String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 사용자 이름과 비밀번호를 검증하는 로직을 구현해야 합니다.
        // 예시로 사용자 이름이 "admin", 비밀번호가 "password"인 경우에만 로그인 성공으로 가정합니다.
        if ("admin".equals(username) && "password".equals(password)) {
            // 로그인 성공 시 세션에 사용자 정보를 저장합니다.
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", username);

            // 설문조사 페이지로 리다이렉트합니다.
            response.sendRedirect("/surveyServlet");
        } else {
            // 로그인 실패 시 다시 로그인 페이지로 이동합니다.
            response.sendRedirect("login.jsp");
        }
} catch (Exception e) {
    System.out.println(e.getMessage());
}
System.out.println("LoginServlet - doGet() done.");
    }
}
