import java.time.LocalDate;


    public class Person{
//        khai báo thuộc th=ính
        public  String name;
        public int age;
        public String adress;

//
        public Person(){
            System.out.println("constructor mặc đinh được gọi");
        }
//        constructor 1 tham số


        public Person(int age) {
            System.out.println("constructor 1 tham số đc gọi");
            this.age = age;
        }

//        full tham số


        public Person(String name, int age, String adress) {
            System.out.println("constructor full thuộc tính");
            this.name = name;
            this.age = age;
            this.adress = adress;
        }

        //        khai báo phương thức
        public void play (){
            System.out.println("đang chơi game");
        }
        public void eat(String foodName){
            System.out.println("đang ăn" + foodName);
        }
        public int getyearofbirth(){
            return LocalDate.now().getYear()-age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", adress='" + adress + '\'' +
                    '}';


        }

        


    }

