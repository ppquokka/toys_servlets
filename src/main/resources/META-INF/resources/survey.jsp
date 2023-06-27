<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Survey</title>
</head>

<body>
    <h1>설문조사</h1>
    <form action="/submitSurveyServlet" method="post">
        <p>1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?</p>
        <input type="radio" id="q1-1" name="q1" value="1">
        <label for="q1-1">전혀 아니다.</label>
        <br>
        <input type="radio" id="q1-2" name="q1" value="2">
        <label for="q1-2">아니다.</label>
        <br>
        <input type="radio" id="q1-3" name="q1" value="3">
        <label for="q1-3">그렇다.</label>
        <br>
        <input type="radio" id="q1-4" name="q1" value="4">
        <label for="q1-4">매우 그렇다.</label>
        <br><br>
        
        <p>2. 강의의 내용은 체계적이고 성의있게 구성되었는가?</p>
        <input type="radio" id="q2-1" name="q2" value="1">
        <label for="q2-1">전혀 아니다.</label>
        <br>
        <input type="radio" id="q2-2" name="q2" value="2">
        <label for="q2-2">아니다.</label>
        <br>
        <input type="radio" id="q2-3" name="q2" value="3">
        <label for="q2-3">그렇다.</label>
        <br>
        <input type="radio" id="q2-4" name="q2" value="4">
        <label for="q2-4">매우 그렇다.</label>
        <br><br>
        
        <p>3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?</p>
        <input type="radio" id="q3-1" name="q3" value="1">
        <label for="q3-1">전혀 아니다.</label>
        <br>
        <input type="radio" id="q3-2" name="q3" value="2">
        <label for="q3-2">아니다.</label>
        <br>
        <input type="radio" id="q3-3" name="q3" value="3">
        <label for="q3-3">그렇다.</label>
        <br>
        <input type="radio" id="q3-4" name="q3" value="4">
        <label for="q3-4">매우 그렇다.</label>
        <br><br>
        
        <p>4. 강의 진행 속도는 적절하였는가?</p>
        <input type="radio" id="q4-1" name="q4" value="1">
        <label for="q4-1">전혀 아니다.</label>
        <br>
        <input type="radio" id="q4-2" name="q4" value="2">
        <label for="q4-2">아니다.</label>
        <br>
        <input type="radio" id="q4-3" name="q4" value="3">
        <label for="q4-3">그렇다.</label>
        <br>
        <input type="radio" id="q4-4" name="q4" value="4">
        <label for="q4-4">매우 그렇다.</label>
        <br><br>
        
        <input type="submit" value="제출">
    </form>
</body>

</html>