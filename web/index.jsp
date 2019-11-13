<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <c:forEach items="${danh_sach_hoc_vien}" var="student">

    <h2><c:out value="${student.getAge()}"></c:out></h2>

  </c:forEach>

  </body>
</html>
