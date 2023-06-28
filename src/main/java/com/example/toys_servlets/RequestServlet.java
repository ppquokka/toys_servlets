package com.example.toys_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/requestServlet")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();

            printWriter.println("<!DOCTYPE html>");
            printWriter.println("<html lang=\"en\">");
            printWriter.println("<head>");
            printWriter.println("    <meta charset=\"UTF-8\">");
            printWriter.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            printWriter.println("    <title>Survey</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("    <h1>설문조사</h1>");
            printWriter.println("    <div class=\"menu\">");
            printWriter.println("        <ul>");
            printWriter.println("            <li><a href=\"member.jsp\">회원관리</a></li>");
            printWriter.println("            <li><a href=\"login.jsp\">로그인/로그아웃</a></li>");
            printWriter.println("            <li><a href=\"survey.jsp\">설문하기</a></li>");
            printWriter.println("            <li><a href=\"statistics.jsp\">설문통계</a></li>");
            printWriter.println("        </ul>");
            printWriter.println("    </div>");
            printWriter.println("    <div class=\"content\">");
            printWriter.println("        <h2>설문조사 질문</h2>");
            printWriter.println("        <form action=\"surveyResult.jsp\" method=\"post\">");
            printWriter.println("            <p>1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?</p>");
            printWriter.println("            <input type=\"radio\" name=\"q1\" value=\"1\">전혀 아니다.");
            printWriter.println("            <input type=\"radio\" name=\"q1\" value=\"2\">아니다.");
            printWriter.println("            <input type=\"radio\" name=\"q1\" value=\"3\">그렇다.");
            printWriter.println("            <input type=\"radio\" name=\"q1\" value=\"4\">매우 그렇다.");
            printWriter.println("            <p>2. 강의의 내용은 체계적이고 성의있게 구성되었는가?</p>");
            printWriter.println("            <input type=\"radio\" name=\"q2\" value=\"1\">전혀 아니다.");
            printWriter.println("            <input type=\"radio\" name=\"q2\" value=\"2\">아니다.");
            printWriter.println("            <input type=\"radio\" name=\"q2\" value=\"3\">그렇다.");
            printWriter.println("            <input type=\"radio\" name=\"q2\" value=\"4\">매우 그렇다.");
            printWriter.println("            <p>3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?</p>");
            printWriter.println("            <input type=\"radio\" name=\"q3\" value=\"1\">전혀 아니다.");
            printWriter.println("            <input type=\"radio\" name=\"q3\" value=\"2\">아니다.");
            printWriter.println("            <input type=\"radio\" name=\"q3\" value=\"3\">그렇다.");
            printWriter.println("            <input type=\"radio\" name=\"q3\" value=\"4\">매우 그렇다.");
            printWriter.println("            <p>4. 강의 진행 속도는 적절하였는가?</p>");
            printWriter.println("            <input type=\"radio\" name=\"q4\" value=\"1\">전혀 아니다.");
            printWriter.println("            <input type=\"radio\" name=\"q4\" value=\"2\">아니다.");
            printWriter.println("            <input type=\"radio\" name=\"q4\" value=\"3\">그렇다.");
            printWriter.println("            <input type=\"radio\" name=\"q4\" value=\"4\">매우 그렇다.");
            printWriter.println("            <br><br>");
            printWriter.println("            <input type=\"submit\" value=\"제출\">");
            printWriter.println("        </form>");
            printWriter.println("    </div>");
            printWriter.println("</body>");
            printWriter.println("</html>");

            printWriter.close();
            response.sendRedirect("/statistics.jsp");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
