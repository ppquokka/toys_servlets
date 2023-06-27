package com.example.toys_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/surveyServlet")
public class SurveyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String action = request.getParameter("action");

            if (action != null && action.equals("login")) {
                // 로그인 탭을 누르면 로그인 화면으로 전환
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/loginServlet");
                requestDispatcher.forward(request, response);
            } else if (action != null && action.equals("survey")) {
                // 사용자가 로그인을 하면 설문화면으로 전환되어 설문 시작
                HttpSession session = request.getSession();
                String loggedInUser = (String) session.getAttribute("loggedInUser");
                if (loggedInUser != null) {
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/survey.jsp");
                    requestDispatcher.forward(request, response);
                } else {
                    // 로그인하지 않은 사용자는 로그인 화면으로 전환
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
                    requestDispatcher.forward(request, response);
                }
            } else if (action != null && action.equals("submit")) {
                // 설문이 끝나고 제출 버튼을 누르면 통계 화면으로 전환되고 통계 산출
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/statistics.jsp");
                requestDispatcher.forward(request, response);
            } else {

                // 기본 화면 구성
                response.setContentType("text/html;charset=UTF-8");

                // HTML 코드 작성
                PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Survey</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>설문조사</h1>");
                out.println("<a href=\"/surveyServlet?action=login\">회원정보</a>");
                out.println("<a href=\"/surveyServlet?action=login\">설문하기</a>");
                out.println("<a href=\"/surveyServlet?action=login\">설문통계</a>");
                out.println("<a href=\"/surveyServlet?action=login\">로그인</a>");
                out.println("</body>");
                out.println("</html>");
                out.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}






