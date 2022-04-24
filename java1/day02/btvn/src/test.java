import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap chieu dai");
        Double dai = sc.nextDouble();

        System.out.println("nhap chieu cao");
        Double cao=sc.nextDouble();

        Double cchuvi= dai*2+cao*2;
        System.out.println(cchuvi);



    }
}
