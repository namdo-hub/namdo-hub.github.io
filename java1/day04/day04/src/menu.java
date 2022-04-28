import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        showMenu();
        Scanner sc = new Scanner(System.in);
        boolean isContunue =true;
        int option = 0;

        while (isContunue){
            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option){
                case 1 :{
                    System.out.print("Nhập vào chuỗi");
                    String str = sc.nextLine();
                    System.out.println();
                    break;
                }
                case 2 : {
                    System.out.print("Nhập vào chuỗi");
                    String str = sc.nextLine();
                    System.out.println("bai2");
                    break;

                }
                case 3 : {
                    isContunue =false;
                    break;
                }
                default:{
                    System.out.println("lựa chọn ko hợp lệ");
                    break;
                }
            }
        }

    }
    public  static void showMenu(){
        System.out.println("1-bai1");
        System.out.println("2-bai2");
        System.out.println("thoat chuong trinh");
    }
}
