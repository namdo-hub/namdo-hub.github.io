import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số a =");
        int a=scanner.nextInt();

        System.out.println("Nhập vào số b =");
        int b=scanner.nextInt();

        System.out.printf( "%d + %d = %d\n",  a, b,a+b);
        System.out.printf( "%d - %d = %d\n", a,b,a-b);
        System.out.printf( "%d * %d = %d\n", a,b,a*b);
        System.out.printf( "%d / %d = %f\n", a,b,(float)a/b);

    }
}
