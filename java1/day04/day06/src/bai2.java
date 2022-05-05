import java.util.Scanner;
import java.util.StringTokenizer;

public class bai2 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập chuỗi: ");
        str = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int soTuTrongChuoi = stringTokenizer.countTokens();
        System.out.println("Số từ có trong chuỗi \"" + str + "\" = " + soTuTrongChuoi);


        }



        }








