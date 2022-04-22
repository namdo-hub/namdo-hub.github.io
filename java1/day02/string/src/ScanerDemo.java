import java.util.Scanner;

public class ScanerDemo {
    public static void main(String[] args) {
//        khởi tảo đối tuonwgj scaner
        Scanner sc =new Scanner(System.in);

        System.out.println("Nhập tên");
        String name =sc.nextLine();

        System.out.println("Nhập quên quán : ");
        String address = sc.nextLine();

        System.out.println("Nhập tuổi");
//        int age =Integer.parseInt(sc.nextLine());
        int age =sc.nextInt();
        sc.nextLine();



        System.out.println("Nhập email");
        String email =sc.nextLine();

        System.out.println("tên tôi là " + name + "Năm nay tôi" + age +"tuổi,quê quán "+address +"email" + email);

//        System.out.println("Nhập cân nặng(kg)");
//        double weight =sc.nextDouble();
//
//        System.out.println("Nhập chiều cao (m)");
//        double height =sc.nextDouble();
//
//        System.out.println("Với weight = " +weight+ "và height ="+height +"thì chỉ số BMI = " + calculateBMI(weight,height));
//
////        Tính bmi
//        public static double calculateBMI(double weight, double height ){
//            return weight/(height*height);
//        }

    }
}
