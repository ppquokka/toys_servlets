package com.example.toys_servlets;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;

// @WebFilter(urlPatterns = "/*")
public class Sessionfilters implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        try {
            System.out.println(request.getRemoteHost());
            System.out.println(request.getRemoteAddr());

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/helloWorldServlet");
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}







// // 로그인/ 아웃 ,SessionCreateServlet, SessionDeleteServlet, HelloWorldJSPServlet, Sessionfilters 4가지 이용

// package com.example.toys_servlets;

// import java.io.IOException;
// import javax.servlet.Filter;
// import javax.servlet.FilterChain;
// import javax.servlet.RequestDispatcher;
// import javax.servlet.ServletException;
// import javax.servlet.ServletRequest;
// import javax.servlet.ServletResponse;
// //import javax.servlet.annotation.WebFilter;


// // @WebFilter(urlPatterns = "/*")
// public class Sessionfilters implements Filter {

//     @Override
//     public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//             throws IOException, ServletException {
//         try {
//             String contents = "Yoju Lab !";

//             System.out.println(request.getRemoteHost());
//             System.out.println(request.getRemoteAddr());

//             RequestDispatcher requestDispatcher = request.getRequestDispatcher("/helloWorldServlet");
//             requestDispatcher.forward(request, response);

//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }

// }

 

    

