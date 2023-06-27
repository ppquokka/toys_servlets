// package com.example.toys_servlets;

// import java.io.IOException;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import javax.servlet.http.HttpSession;


// public class LoginServlet extends HttpServlet {
//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {
//         System.out.println("LoginServlet - doGet()");
// try {
//     String username = request.getParameter("username");
//         String password = request.getParameter("password");

//         // 사용자 이름과 비밀번호를 검증하는 로직을 구현해야 합니다.
//         // 예시로 사용자 이름이 "admin", 비밀번호가 "password"인 경우에만 로그인 성공으로 가정합니다.
//         if ("admin".equals(username) && "password".equals(password)) {
//             // 로그인 성공 시 세션에 사용자 정보를 저장합니다.
//             HttpSession session = request.getSession();
//             session.setAttribute("loggedInUser", username);

//             // 설문조사 페이지로 리다이렉트합니다.
//             response.sendRedirect("/surveyServlet");
//         } else {
//             // 로그인 실패 시 다시 로그인 페이지로 이동합니다.
//             response.sendRedirect("/login.jsp");
//         }
// } catch (Exception e) {
//     System.out.println(e.getMessage());
// }
// System.out.println("LoginServlet - doGet() done.");
//     }
// }

package com.example.toys_servlets;

import java.io.IOException;
import java.io.PrintWriter;

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
        response.setContentType("text/html;charset=UTF-8");
        // 로그인 폼을 출력
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<meta charset='UTF-8'>");
        printWriter.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        printWriter.println("<title>Login</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h1>Login</h1>");
        printWriter.println("<form action='/loginServlet' method='post'>");
        printWriter.println("<label for='username'>Username:</label>");
        printWriter.println("<input type='text' id='username' name='username'>");
        printWriter.println("<br>");
        printWriter.println("<label for='password'>Password:</label>");
        printWriter.println("<input type='password' id='password' name='password'>");
        printWriter.println("<br>");
        printWriter.println("<input type='submit' value='Login'>");
        printWriter.println("</form>");
        printWriter.println("</body>");
        printWriter.println("</html>");
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 예시로 username이 "admin"이고 Password가 "1234"인 경우에만 로그인 성공으로 가정
        if (username.equals("admin") && password.equals("1234")) {
            // 로그인 성공
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // 설문조사 페이지로 이동
            response.sendRedirect("/surveyServlet");
        } else {
            // 로그인 실패 시 다시 로그인 페이지로 이동
            response.sendRedirect("/loginServlet");
        }
    }
}


