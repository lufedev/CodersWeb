package com.web.servlet;

import java.io.IOException;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SaudacaoServlet", urlPatterns = {"/saudacao"})
public class BoasVindasServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");

        LocalTime horaAtual = LocalTime.now();
        String saudacao = "";

        if (horaAtual.isBefore(LocalTime.NOON)) {
            saudacao = "Bom dia";
        } else if (horaAtual.isBefore(LocalTime.of(18, 0))) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }

        String mensagem = saudacao + ", " + nome + "!";

        request.setAttribute("mensagem", mensagem);
        request.setAttribute("email", email);

        request.getRequestDispatcher("boas-vindas.jsp").forward(request, response);
    }
}
