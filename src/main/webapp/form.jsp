<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário]</title>
</head>
<body>

<%
	Cookie[] cookies = request.getCookies();
	String nome = "";
	
	if(cookies != null) {
		
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("nomeusu")){
				nome = cookie.getValue();
				break;
			}
		}
	}
%>

<form action="Salvar" method="get">

Nome do usuário: <input type="text" name="nome" value="<%= nome %>"><br>
<input type="submit" value="processar">
</form>

</body>
</html>