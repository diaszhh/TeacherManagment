package servlets;

import DB.DBConnector;

import DB.DBManager;
import DB.Teacher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Teacher> teachers =  DBConnector.getTeachers();
        request.setAttribute("prepodi", teachers);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
