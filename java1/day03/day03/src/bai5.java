import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        nam();
    }
    public static float nam(float radius){
        Scanner sc =new Scanner(System.in);

        float a=4/3;
        float b;
        b= (float) Math.PI;

        System.out.println("Nhập vào số c =");
        int c =sc.nextInt();



        System.out.printf( "%f+%f*%dMath.pow(c,3)= %f", a,b,c,a*b*Math.pow(c,3));
        return nam();
    }
}
