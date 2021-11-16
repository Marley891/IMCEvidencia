<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
IdUsuario<br><br>
    <form action="IdUsuario" method="post">
    IdImc:<br>
    <input type="text" name="IdImc" value=""><br>
    Peso:<br>
    <input type="text" name="peso" value=""><br>
    Estatura:<br>
    <input type="text" name="estatura" value=""><br>
    Fecha:<br>
    <input type="text" name="Fecha" value=""><br>
    ="submit" value="CalculaIMC">
    </form>
    <a href="index.jsp">Regresar</a><br>
    
    <% String mensaje = (String)request.getAttribute("IMC correcto");
       if (mensaje == null) {
    	   mensaje = "";
       }
    %> 
    <%=mensaje%> 
</body>
</html>