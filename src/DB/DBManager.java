package DB;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<Teacher> teachers = new ArrayList<>();
    private static int id = 6;

    static {
        teachers.add(new Teacher(1, "Timur", "Timurov", 7));
        teachers.add(new Teacher(2, "Kuat", "Kuatov", 8));
        teachers.add(new Teacher(3, "Rinat", "Rinatov", 9));
        teachers.add(new Teacher(4, "Marat", "Maratov", 10));
        teachers.add(new Teacher(5, "Nail", "Nailev", 6));
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public static void addTeacher(Teacher teacher) {
        teacher.setId(id);
        teachers.add(teacher);
        id++;
    }

    public static Teacher getTeacher(int id) {
        return teachers.stream().filter(a -> a.getId() == id).findFirst().orElseThrow();
//        Teacher teacher = teachers.get(id - 1);
//        return teacher;
    }

    public static void deleteTeacher(int id) {
        Teacher teacher = teachers.stream().filter(s -> s.getId() == id).findFirst().orElseThrow();
        teachers.remove(teacher);
    }
}
