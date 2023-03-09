<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Exemplo Servlet - Boas-vindas (EX: 01, 02 & 03)</title>
</head>
<body>
<h2>Informe seu nome e e-mail</h2>

<form action="saudacao" method="post">
    <label for="nome">Nome:</label>
    <input type="text" name="nome" id="nome" required><br><br>
    <label for="email">E-mail:</label>
    <input type="email" name="email" id="email" required><br><br>
    <button type="submit">Enviar</button>
</form>

<h2> Também teste as requisições /imc e /peso-ideal !!</h2>
</body>
</html>