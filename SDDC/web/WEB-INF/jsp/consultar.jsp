<%-- 
    Document   : consultar
    Created on : 26-oct-2016, 15:17:30
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LISTA DE DATOS</title>
    </head>
    <body>
        <a href="">Agregar</a>
        <table style="border-collapse: collapse" cellpadding="7px" border="1">
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                
            </tr>

            <c:forEach items="${lst}" var="p">
                <tr>
                    <td>${p.idCategoria}</td>
                    <td>${p.nombreCategoria}</td>
                    

                    
                    <td>
                        <a href="edit.html?id=">
                            Edit </a>
                        <a href="remove.html?id=" onclick="return confirm('Are you sure?')">Remove</a>
                    </td>
                </tr>
            </c:forEach>

        </table>





    </body>

</html>
