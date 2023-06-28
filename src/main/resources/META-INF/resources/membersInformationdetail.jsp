<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    </script>
    <title>Document</title>
</head>

<body>
    <div class="container">
        <% String search=(String) request.getAttribute("search"); %>
            <form action="/userInforsServlet">
                <label>검색
                    <input type="text" name="search" value="<%= search %>">
                </label>
                <button>검색 하기</button>
            </form>
    <div class = h3>회원관리</div>
    <div class="container">
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th>USER</th>
                    <th>USER_LOGINID</th>
                    <th>PW</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>홍길동</td>
                    <td>surveyUser123</td>
                    <td>1234</td>
                </tr>
                 <tr>
                    <td>장길산</td>
                    <td>questionnairePro</td>
                    <td>4567</td>
                </tr>
                <tr>
                    <td>신사임당</td>
                    <td>responseMaster</td>
                    <td>6789</td>
                </tr>
                <tr>
                    <td>이순신</td>
                    <td>feedbackGuru</td>
                    <td>9123</td>
                </tr>
              
            </tbody>
        </table>
    </div>
</body>

</html>