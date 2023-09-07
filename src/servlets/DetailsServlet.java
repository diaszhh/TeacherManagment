//package servlets;
//
////import DB.DBManager;
//import DB.DBConnector;
//import DB.Teacher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//
//@WebServlet(value ="/details")
//public class DetailsServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//
//        Teacher teacher =  DBConnector.getTeacher(id);
//        request.setAttribute("uchitel", teacher);
//        request.getRequestDispatcher("/details.jsp").forward(request, response);
//    }
//}
