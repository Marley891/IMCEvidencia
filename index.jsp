<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="login" method="post">
        Usuario:<br>
        <input type="text" name="usuario" value=""><br>
        Password:<br>
        <input type="text" name="password" value=""><br>
        <input type="submit" value="Entrar">
    </form>
   No eres usuario? <a href="registro.jsp">Registrate</a><br>
   
   <% String mensaje = (String)request.getAttribute("usuarioRegistrado");
   if (mensaje == null) {
	   mensaje = "";
   }
   
   %>
   <%=mensaje%> 
</body>
</html>