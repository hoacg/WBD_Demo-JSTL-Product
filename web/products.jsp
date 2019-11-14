<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
    <style>

        table, tr, td {
            border: 1px solid grey;
        }

    </style>
</head>
<body>

<table>

    <tr>
        <td>Tên sản phẩm</td>
        <td>Giá</td>
        <td>Hình ảnh</td>
    </tr>

<c:forEach items="${danh_sach_san_pham}" var="product">

    <tr>
        <td>${product.getName()}</td>
        <td>${product.getPrice()}</td>
        <td>
            <img src="${product.getImage()}" height="100" width="100" />
        </td>

    </tr>


</c:forEach>
</table>

</body>
</html>
