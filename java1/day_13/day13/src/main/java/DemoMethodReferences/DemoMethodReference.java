package DemoMethodReferences;

import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
interface Hello{
    void display();
}
public class DemoMethodReference {

    public static void main(String[] args) {
//        tạo 1list student
        List<Student>students=new ArrayList<>();
        students.add(new Student(1,"nam","a@gmail.com"));
        students.add(new Student(2,"nam2","a2@gmail.com"));
//        in ra
        students.forEach(Student::printInfo);
        students.forEach(System.out::println);
        students.forEach(student -> System.out.println(student));

//        Sắp xếp theo tên
        students.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
        students.forEach(System.out::println);

//        triển khai funcional interface dựa trên rẻence
        Student student=new Student(1,"nam","am");
        Hello h=student::printInfo;
        h.display();

        Hello h1=()-> System.out.println(student.getId()+"-"+student.getName()+"="+student.getEmail());
        h1.display();
    }
}
