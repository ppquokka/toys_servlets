package com.example.toys_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toys_servlets.daos.UserInforsDao;

@WebServlet(urlPatterns = "/userInforsServlet")
public class UserInforsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String search = request.getParameter("search");

            String contents = "";
            UserInforsDao userInforsDao = new UserInforsDao();
            ArrayList<HashMap<String, String>> userInforList = userInforsDao.SelectWithSearch(search);

            for (int i = 0; i < userInforList.size(); i = i + 1) {
                HashMap<String, String> userInforRecord = userInforList.get(i);
                contents = contents + "                <tr>\r\n" + //
                        "                    <td>" + userInforRecord.get("USER") + "</td>\r\n" + //
                        "                    <td>" + userInforRecord.get("USER_LOGINID") + "</td>\r\n" + //
                        "                </tr>\r\n";
            }
            contents = contents + "";
            // getWriter 전에 charset 하기
            response.setContentType("text/html;charset=UTF-8");

            PrintWriter printWriter = response.getWriter();
            printWriter.println(contents);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}





// package com.example.toys_servlets;

    
// import java.io.IOException;
// import java.io.PrintWriter;
// import java.sql.ResultSet;
// import java.sql.Statement;
// import java.util.ArrayList;
// import java.util.HashMap;

// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import com.example.study_servlets.daos.OptionInforsDao;
// import com.example.toys_servlets.daos.UserInforsDao;

// @WebServlet(urlPatterns = "/userInforsServlet")
// public class UserInforsServlet extends HttpServlet {
//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {
//         try {
//             String search = request.getParameter("search");

//             String contents = "";
//             UserInforsDao userInforsDao = new UserInforsDao();
//             ArrayList userInforList = new ArrayList<>();
//             userInforList = userInforsDao.SelectWithSearch(search);

//             for(int i=0; i< userInforList.size(); i=i+1) {
//                 HashMap userInforRecord = new HashMap<>();
//                 userInforRecord = (HashMap) userInforList.get(i);
//                 contents = contents + "                <tr>\r\n" + //
//                         "                    <td>"+userInforRecord.get("USER")+"</td>\r\n" + //
//                         "                    <td>"+userInforRecord.get("USER_LOGINID")+"</td>\r\n" + //
//                         "                </tr>\r\n";
//             }
//             contents = contents + "";
//             // getWriter 전에 charset 하기
//             response.setContentType("text/html;charset=UTF-8");

//             PrintWriter printWriter = response.getWriter();
//             printWriter.println(contents);
//             printWriter.close();
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }
    

