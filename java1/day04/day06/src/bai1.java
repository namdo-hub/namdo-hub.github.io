import java.util.Scanner;

public class bai1 {
    public static void bai1vuong(String[] args) {
        int dai;
        int rong;
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("dai = ");
        dai = sc.nextInt();
        System.out.print("rong = ");
        rong = sc.nextInt();

        for(i = 1; i <= dai; i++){
            for(int j = 1; j <= rong; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }



        }
        }





