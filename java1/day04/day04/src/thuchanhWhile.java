import java.util.Scanner;

public class thuchanhWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (true){
            System.out.println("Nhap mot so bat ki");
            int i= sc.nextInt();
            if (i == 0){
                System.out.println("Số phải khác 0 nhập lại");

            }
            else {
                System.out.println("số vừa nhập là" + i);
                break;
            }




        }
    }
}
