import java.util.Random;
import java.util.Scanner;

public class thuchanhWhilebai2 {

    public static void main(String[] args) {

        Random rd = new Random();
        int rdNumber = rd.nextInt(99);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số");
            int i = sc.nextInt();

            if (i > rdNumber) {
                System.out.println("Bạn nhập số lớn hơn rồi,nhập lại");
            } else if (i < rdNumber) {
                System.out.println("Bạn nhập số nhỏ hơn rồi,nhập lại");
            } else {
                System.out.println("bạn nhập đúng rồi");
                break;
            }

        }


    }
}


