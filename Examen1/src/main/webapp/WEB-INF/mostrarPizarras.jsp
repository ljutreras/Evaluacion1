<%--
  Created by IntelliJ IDEA.
  User: hob
  Date: 20-06-22
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mostrar Pizarras</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>

<div>
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Marca</th>
                <th scope="col">Dimension</th>
                <th scope="col">Color</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="pizarron" items="${pizarrasCapturadas}">
                <tr>
                    <th scope="row">${pizarron.id}</th>
                    <td>${pizarron.marca}</td>
                    <td>${pizarron.dimension}</td>
                    <td>${pizarron.color}</td>
                    <td><a class="btn btn-warning" href="/index/editar/${pizarron.id}" role="button">Editar</a></td>
                    <td><a class="btn btn-danger" href="/index/eliminar/${pizarron.id}" role="button">Eliminar</a></td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
    </div>


    </body>
    </html>
