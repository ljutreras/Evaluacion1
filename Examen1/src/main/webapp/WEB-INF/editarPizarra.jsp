<%--
  Created by IntelliJ IDEA.
  User: hob
  Date: 20-06-22
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Index</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<div>

    <%--@elvariable id="pizarron" type="Pizarron"--%>
    <form:form action="/index/actualizar/${pizarron.id}" method="post" modelAttribute="pizarron">
        <form:label path="marca" class="form-label">Marca:</form:label>
        <form:input path="marca" class="form-control"/>
        <br>
        <form:label path="dimension" class="form-label">Dimension en metros cuadrados:</form:label>
        <form:input path="dimension" class="form-control"/>
        <br>
        <form:label path="color" class="form-label">Color:</form:label>
        <form:input path="color" class="form-control"/>
        <br>
        <button type="submit" class="btn btn-primary"> Guardar </button>






    </form:form>

</div>

</body>
</html>
