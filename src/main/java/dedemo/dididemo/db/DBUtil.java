package dedemo.dididemo.db;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DBUtil {

    public static ArrayList<Student> students = new ArrayList<>();
    public static Long id = 5L;

    static {
        students.add(new Student(1L, "Batyrkhan", "Kenzhaliyev", 99,"A"));
        students.add(new Student(2L, "Arman", "Kaliakyn", 50,"D"));
        students.add(new Student(3L, "Duman", "Talgatov", 74,"C"));
        students.add(new Student(4L, "Erasyl", "Arkhat", 75,"B"));
        students.add(new Student(5L, "Name", "Surname", 49,"F"));
    }

    public static ArrayList<Student> getAllStudent() {
        return students;
    }

    public static void addStudent(Student student){
        student.setId(id);
        students.add(student);
        id++;
    }

}
