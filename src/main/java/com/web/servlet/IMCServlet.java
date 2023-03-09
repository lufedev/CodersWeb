package com.web.servlet;

import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IMCServlet", value = "/imc")
public class IMCServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String pesoStr = request.getParameter("peso");
        String alturaStr = request.getParameter("altura");

        double peso = Double.parseDouble(pesoStr);
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>" + "Seu IMC é: " + imc + "</h1>");
        out.println("</body></html>");

    }
    public void destroy() {
    }
}