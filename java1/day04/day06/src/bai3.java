import java.util.Scanner;

public class bai3 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n = ");
        int n=sc.nextInt();

        if(isPrimeNumber(n)){
            System.out.println(n+" là số nguyên tố");
        } else {
            System.out.println(n+" không là số nguyên tố");
        }


    }
}
