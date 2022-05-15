public class Test1 {
    public static void main(String[] args) {
        Student student = new Student("Nguyễn Văn A", 20, Gender.MALE);
        System.out.println(student);

        System.out.println(Student.school);
        Student.sayHello();
    }
}