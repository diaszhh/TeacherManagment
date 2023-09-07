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

@WebServlet(value = "/add-teacher")
public class AddTeacherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/addPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("teacherName");
        String surname = request.getParameter("teacherSurname");
        int rating = Integer.parseInt(request.getParameter("teacherRating"));

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurname(surname);
        teacher.setRating(rating);

        DBConnector.addTeacher(teacher);

        response.sendRedirect("/");
    }
}
