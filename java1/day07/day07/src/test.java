public class test {
    public static void main(String[] args) {
//        tạo đối tượng
        Person person =new Person();
//        gán giá trị cho đối tượng
        person.name="Namdo";
        person.age=23;
        person.adress="hanoi";
//        in ra thông tin
        System.out.println(person.name +" - "+person.age +"-"+person.adress);
        System.out.println(person);
//        gọi phuuwong thức
        person.play();
        person.eat("pho");
        System.out.println(person.getyearofbirth());
//khở tạo 1 tham số
        Person person1=new Person(12);
        System.out.println(person1);
//        full tham ssoo
        Person person2=new Person();

        Calculator calculator=new Calculator();
        calculator.number1=5;
        calculator.number2=7;

        System.out.println(calculator.addition());
        System.out.println(calculator.division());
        System.out.println(calculator.multi());
        System.out.println(calculator.subtract());

        Employee employee=new Employee();
        employee.name="namdo";
        employee.totalHours=120;



    }
}
