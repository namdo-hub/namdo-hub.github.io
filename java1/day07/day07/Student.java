public class Student {
    public Sring name;
    public int age;
    public Gender gender;

    public Student(String name){
        System.out.println("contruction mặc định ");
        this.name=name;
    }

    public Student(Sring name, int age) {
        this(name,age);
        System.out.println("contruction 2 tham số");

    }

    public Student(Sring name, int age, Gender gender) {
        System.out.println("contruction 3 tham số");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
