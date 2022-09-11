<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

     <!-- From action and Attribute -->
     <form:form action="prossess" modelAttribute="student">
     <br>
     <br>
   
     FirstName:<form:input path="First Name"  />
     <br>
     <br>
     LastName:<form:input path="Last_Name"  />
     <br>
     <br>
     <!-- Form Contry We need To select  and From the Option We need to Select  -->
     Contry:
     <form:select path ="Country">
     <form:options items="${student.contries}"/>
     </form:select>
      <br>
      <br>
      <!--  From the FL we need to Chose The Option as the Radio Button View  -->
     
    Favourite Language:
     Java<form:radiobutton path="favouritelanguage" value="java"/>
     Anguler<form:radiobutton path="favouritelanguage" value="Anguler"/>
      React<form:radiobutton path="favouritelanguage" value="React"/>
       Velocity<form:radiobutton path="favouritelanguage" value="velocity"/>
        Pythone<form:radiobutton path="favouritelanguage" value="Pythone"/>
    <br>
    <br>
    OperetionSystem:-
    <br>
    <br>
    Linux <form: checkBox path="operetionSystem"value="Linux"  />
    MS Windoes <form: checkBox path="OperetionSystem" value="MS Windoes"  />
    MAC OS <form: checkBox path="OperetionSystem" value="Mac OS"  />
    Rasvari pye<form: checkBox path="OperetionSystem" value="Rasvari Pye" />
    Linux<form: checkbox path= "OperetionSystem" value="Linux"  />
    
<br>
<input type="Submit" value="Submit"/>

</form:form>
<body>
</html>






