<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="models.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
  List<Student> students = new ArrayList<>();
  students.add(new Student("Tùng", "18") );
  students.add(new Student("Bách", "18") );
  students.add(new Student("Nghĩa", "18") );

  request.setAttribute("danh_sach_hoc_vien", students);

%>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <c:out value="'Xin chào'"></c:out>

  <c:forEach items="${danh_sach_hoc_vien}" var="student">

    <h2><c:out value="${student.getAge()}"></c:out></h2>

  </c:forEach>

  </body>
</html>
