package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class DBConnector {
    private static Connection connection;
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/bitlab";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "root";

    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Teacher> getTeachers(){
        ArrayList<Teacher>teachers=new ArrayList<>();
        try {
            PreparedStatement statement=connection.prepareStatement(
                    "SELECT * FROM teachers"
            );

            ResultSet resultSet=statement.executeQuery();

            while (resultSet.next()){
                Teacher teacher=new Teacher();

                teacher.setId(resultSet.getInt("id"));
                teacher.setName(resultSet.getString("name"));
                teacher.setSurname(resultSet.getString("surname"));
                teacher.setRating(resultSet.getInt("rating"));

                teachers.add(teacher);
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return teachers;
    }

    public static void addTeacher(Teacher teacher){
        try{
            PreparedStatement statement=connection.prepareStatement(
                        "INSERT INTO teachers(name, surname, rating) Values (?, ?, ?)"
            );

            statement.setString(1, teacher.getName());
            statement.setString(2, teacher.getSurname());
            statement.setInt(3,teacher.getRating());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Teacher> changeTeacher(int id){



        return null;
    }
}