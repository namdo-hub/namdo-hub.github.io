import java.util.Scanner;

public class thuchanh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();

        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();

        double bmi = weight/(height*height);

        System.out.println("Chỉ số bmi của bạn là: " +bmi);

        if(bmi<18.5){
            System.out.println("thiếu cân");

        }
        if (bmi>=18.5 && bmi<=24.9){
            System.out.println("Bình thường");
        }
        else {
            System.out.println("Thừa cân");
        }
    }
}
