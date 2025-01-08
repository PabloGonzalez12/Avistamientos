<jsp:directive.page contentType="text/html" pageEncoding="UTF-8"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:url var="estilo" value="/css/style.css" scope="application" />
        <c:set var="contexto" value="${pageContext.request.contextPath}" scope="application"/>
        <title>Seleccionar base de datos</title>
    </head>
    <body>
        <form action="${contexto}/SelectDBController" method="post">
            <h1>Seleccionar base de datos</h1>
            <label for="db">Selecciona una base de datos</label>
            <select name="db">
                <option value="MySQL">MySQL</option>
                <option value="Derby">Derby</option>
            </select>
            <input type="submit">
        </form>
    </body>
</html>