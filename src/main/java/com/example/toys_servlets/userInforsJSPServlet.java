// // 회원관리, 설문하기, 설문통계 OptionInforsJSPServlet,OptionInforsDeleteServlet 두가지 활용

// package com.example.toys_servlets;


// import java.io.IOException;
// import java.io.PrintWriter;
// import java.sql.ResultSet;
// import java.sql.Statement;
// import java.util.ArrayList;
// import java.util.HashMap;

// import javax.servlet.RequestDispatcher;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import com.example.study_servlets.daos.OptionInforsDao;
// import com.example.toys_servlets.daos.UserInforsDao;


<<<<<<< HEAD
@WebServlet(urlPatterns = "/userInforsJSPServlet")
public class UserInforsJSPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String search = request.getParameter("search");
            ArrayList optionInforList = new ArrayList<>();
            UserInforsDao userInforsDao = new UserInforsDao();
         
            ArrayList<HashMap<String, String>> userInforList = userInforsDao.selectWithSearch(search);

            request.setAttribute("search", search);
            request.setAttribute("userInforList", userInforList);
=======
// @WebServlet(urlPatterns = "/userInforsJSPServlet")
// public class UserInforsJSPServlet extends HttpServlet {
//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {
//         try {
//             String search = request.getParameter("search");

//             UserInforsDao userInforsDao = new UserInforsDao();
//             ArrayList userInforList = new ArrayList<>();
//             userInforList = userInforsDao.selectWithSearch(search);

//            request.setAttribute("search", search);
//             request.setAttribute("userInforList", userInforList);
>>>>>>> 67ed827e642be6c7e482cf95ad1583be4909422b

//             // getWriter 전에 charset 하기
//             response.setContentType("text/html;charset=UTF-8");

//             // 다음 파일 호출
//             RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
//             requestDispatcher.forward(request, response);

//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }


    

