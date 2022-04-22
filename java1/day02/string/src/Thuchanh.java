import java.util.Scanner;

public class Thuchanh {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        System.out.println("Nhập vào số a =");
        float a  =sc.nextFloat();



        System.out.println("Nhập vào số b =");
        float b =sc.nextFloat();


        System.out.printf( "%d + %d = %d", a,b,a+b);
        System.out.printf( "%d - %d = %d", a,b,a-b);
        System.out.printf( "%d * %d = %d", a,b,a*b);
        System.out.printf( "%d / %d = %d%f", a,b,a/b);








    }


}
