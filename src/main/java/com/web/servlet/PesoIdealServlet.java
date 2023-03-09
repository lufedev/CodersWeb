package com.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "PesoIdealServlet", value = "/peso-ideal")
public class PesoIdealServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String sexo = request.getParameter("sexo");
        String alturaStr = request.getParameter("altura");

        double altura = Double.parseDouble(alturaStr);

        double pesoIdeal;

        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>" + "Seu Peso ideal é: " + pesoIdeal + "</h1>");
        out.println("</body></html>");
    }
}