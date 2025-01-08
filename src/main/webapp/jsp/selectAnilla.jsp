<jsp:directive.page contentType="text/html" pageEncoding="UTF-8"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Avistamientos - ${requestScope.baseDeDatos}</title>
    </head>
    <body>
        <form action="${contexto}/FrontController" method="post">
            <h1>Solicitar Avistamientos</h1>
            <label for="anilla">Anilla:</label>
            <input type="number" name="anilla" id="anilla" min="0" max="100000">
            <input type="submit" name="enviar" value="Solicitar">
        </form>
    </body>
</html>
