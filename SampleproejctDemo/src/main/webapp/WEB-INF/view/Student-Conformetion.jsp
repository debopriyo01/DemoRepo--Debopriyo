<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>The Student Conformation page </h1>

The Student is Conformed :-${student.Firstname};
<br>
<br>
Contries :- ${student.contries };

<br>
<br>
favourite Language :- ${student.favouritelanguage };

<br>
<br>
<!--  the OS can have More Than one  so we will be using The For Each Loop  -->
opereting System Choise :-
s
<ul>
<c:forEach var="temp" items="#{student.operetionSystem}">

<li>${temp}</li>
</c:forEach>
</ul>
</body>
</html>