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

@WebServlet(urlPatterns = "/connectSurveyDBServlet")
public class ConnectSurveyDBServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            StringBuilder contents = new StringBuilder();
            contents.append("<!DOCTYPE html>\r\n");
            contents.append("<html lang=\"en\">\r\n");
            contents.append("<head>\r\n");
            contents.append("    <meta charset=\"UTF-8\">\r\n");
            contents.append("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
            contents.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
            contents.append("    <title>connectSurvey_DB_servlet</title>\r\n");
            contents.append("</head>\r\n");
            contents.append("<body>\r\n");
            contents.append("    <div class=\"container\">\r\n");
            contents.append("        <table class=\"table table-bordered table-hover\">\r\n");
            contents.append("            <thead>\r\n");
            contents.append("                <tr>\r\n");
            contents.append("                    <th>USER</th>\r\n");
            contents.append("                    <th>USER_LOGINID</th>\r\n");
            contents.append("                </tr>\r\n");
            contents.append("            </thead>\r\n");
            contents.append("            <tbody>\r\n");

            UserInforsDao userInforsDao = new UserInforsDao();
            ArrayList<HashMap<String, String>> userList = userInforsDao.selectAll();

            for (HashMap<String, String> hashMap : userList) {
                contents.append("                <tr>\r\n");
                contents.append("                    <td>").append(hashMap.get("USER")).append("</td>\r\n");
                contents.append("                    <td>").append(hashMap.get("USER_LOGINID")).append("</td>\r\n");
                contents.append("                </tr>\r\n");
            }

            contents.append("            </tbody>\r\n");
            contents.append("        </table>\r\n");
            contents.append("    </div>\r\n");
            contents.append("</body>\r\n");
            contents.append("</html>");

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.println(contents);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
