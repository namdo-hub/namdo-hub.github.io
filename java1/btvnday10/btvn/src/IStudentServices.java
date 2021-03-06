

import java.util.ArrayList;

public interface IStudentServices {
    void printListStudents(ArrayList<Student> list);
    Student addNewStudent();
    Student updateStudentPoint(int id);
    void deleteStudent(int id);
    ArrayList<Student> printByClassroom(String name);
    ArrayList<Student> sortByName(ArrayList<Student> list);
    ArrayList<Student> sortById(ArrayList<Student> list);
    ArrayList<Student> sortByPoint(ArrayList<Student> list);

}