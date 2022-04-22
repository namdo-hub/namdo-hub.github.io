import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        System.out.println("Nhập vào chiều dài =");
        int a  =sc.nextInt();



        System.out.println("Nhập vào chiều rộng =");
        int b =sc.nextInt();

        System.out.println("chu vi hình chữ nhật là :");
        System.out.printf("%d*2 + %d*2 = %d\n" , a,b,a*2+b*2 );
        System.out.println("diện tích hình chữ nhật là");
        System.out.printf("%d * %d = %d" , a,b,a*b  );


    }
}
