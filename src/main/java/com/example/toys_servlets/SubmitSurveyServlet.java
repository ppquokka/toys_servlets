package com.example.toys_servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/submitSurveyServlet")
public class SubmitSurveyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 설문 결과 처리 및 통계 계산 로직 작성
        
        // 통계 화면으로 전환
        response.sendRedirect("statistics.jsp");
    }
}
