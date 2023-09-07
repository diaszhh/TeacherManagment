//package servlets;
//
//import DB.Teacher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//@WebServlet(value = "/edit-teacher")
//public class EditTeacherServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String action = request.getParameter("action");
//
//        if(action.equals("delete")){
//            DBManager.deleteTeacher(id);
//            response.sendRedirect("/");
//
//        } else if (action.equals("change")) {
//            String name = request.getParameter("teacherName");
//            String surname = request.getParameter("teacherSurname");
//            int rating = Integer.parseInt(request.getParameter("teacherRating"));
//
//            Teacher teacher = DBManager.getTeacher(id);
//            teacher.setName(name);
//            teacher.setSurname(surname);
//            teacher.setRating(rating);
//
//            ArrayList<Teacher> teachers = DBManager.getTeachers();
//            int index = teachers.indexOf(teacher);
//
//            teachers.set(index, teacher);
//
//            response.sendRedirect("/");
//        }
//    }
//}
