package com.example.toys_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/surveyServlet")
public class SurveyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equals("login")) {
            // 로그인 화면으로 전환
            response.sendRedirect("login.jsp");
        } else if (action != null && action.equals("survey")) {
            // 로그인한 상태에서 설문 페이지로 전환
            HttpSession session = request.getSession();
            String loggedInUser = (String) session.getAttribute("loggedInUser");
            if (loggedInUser != null) {
                response.sendRedirect("survey.jsp");
            } else {
                // 로그인하지 않은 사용자는 로그인 화면으로 전환
                response.sendRedirect("login.jsp");
            }
        } else if (action != null && action.equals("statistics")) {
            // 통계 페이지로 전환
            response.sendRedirect("statistics.jsp");
        } else {
            // 기본 화면 구성
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("    <meta charset=\"UTF-8\">");
            out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\">");
            out.println("    <title>Survey</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class=\"container\">");
            out.println("        <h1>설문조사</h1>");
            out.println("        <div class=\"menu\">");
            out.println("            <a href=\"/surveyServlet?action=members\">회원관리</a>");
            out.println("            <a href=\"/surveyServlet?action=survey\">설문하기</a>");
            out.println("            <a href=\"/surveyServlet?action=statistics\">설문통계</a>");
            out.println("            <a href=\"/loginServlet?action=login\">로그인</a>");
            out.println("        </div>");
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");

            out.close();
        }
    }
}


