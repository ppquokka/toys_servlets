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
    <div class = h3>회원관리</div>
    <div class="container">
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th>USER</th>
                    <th>USER_LOGINID</th>
                    <th>상세정보</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>홍길동</td>
                    <td>surveyUser123</td>
                   
                    <td>
                        <form method="get" action="/resources/membersInformationdetail.jsp">
                            <td>홍길동</td>
                            <td>surveyUser123</td>
                            <button type="submit">보기</button>
                        </form>
                    </td>
                    
                </tr>
                 <tr>
                    <td>장길산</td>
                    <td>questionnairePro</td>
                    <td>
                        <button formaction="/resources/membersInformationdetail.jsp">보기</button>
                    </td>
                </tr>
                <tr>
                    <td>신사임당</td>
                    <td>responseMaster</td>
                    <td>
                        <button formaction="/resources/membersInformationdetail.jsp">보기</button>
                    </td>
                </tr>
                <tr>
                    <td>이순신</td>
                    <td>feedbackGuru</td>
                    <td>
                        <button formaction="/resources/membersInformationdetail.jsp">보기</button>
                    </td>
                </tr>
              
            </tbody>
        </table>
    </div>
</body>

</html>