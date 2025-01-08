/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package es.albarregas.controllers;

import es.albarregas.DAO.IAvistamientoDAO;
import es.albarregas.DAOFactory.DAOFactory;
import es.albarregas.beans.Avistamiento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pablo
 */
@WebServlet(name = "SelectDBController", urlPatterns = {"/SelectDBController"})
public class SelectDBController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher(".").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ".";

        String opcion = request.getParameter("db");

        switch (opcion) {
            case "MySQL":
                url = "jsp/selectAnilla.jsp";
                request.setAttribute("baseDeDatos", "MySQL");
                break;
            case "Derby":
                url = "jsp/selectAnilla.jsp";
                request.setAttribute("baseDeDatos", "Derby");
                break;
        }

        request.getRequestDispatcher(url).forward(request, response);
    }

}
