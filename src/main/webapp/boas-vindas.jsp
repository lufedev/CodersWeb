<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Exercicio 03</title>
</head>
<body>
<h2><%= request.getAttribute("mensagem") %></h2>
<p>Seu e-mail é: <%= request.getAttribute("email") %></p>
<a href="/servlet_war_exploded/">Voltar</a>
</body>
</html>