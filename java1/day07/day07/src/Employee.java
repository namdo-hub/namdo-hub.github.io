public class Employee {
    public  String name;
    public int age;
    public String adress;
    public int totalHours;
    private int salary;


    public void printInfo(){
        System.out.println(name);
        System.out.println(adress);
        System.out.println(age);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", totalHours=" + totalHours +

                '}';
    }

    public int getSalary(){

        int thuong=0;
        salary=totalHours*200000;
        if (totalHours>=200){

            thuong=getSalary()/5;
            
            return thuong+getSalary();

        } else if (totalHours>=100&& totalHours<200) {
            thuong=getSalary()/10;
            return thuong+getSalary();
        }else {
            return getSalary();
        }

    }
}
