import java.util.Random;
import java.util.Scanner;

public class vonglap {
    public static void main(String[] args) {
//        Thực hiện công việc lặp đi lặp lại "thức dậy 7h " trong 30 ngày
//        for (int day = 1 ; day <=30 ;day ++){
//            System.out.println("Ngày " + day + " thưc dậy lúc 7h");
//        }

//        Thực hiện công việc lặp đi lặp lại "thức dậy 7h " vào ngày lẻ
//        for (int day = 1 ; day <=30 ;day ++){
//            if (day%2==1){
//                System.out.println("Ngày " + day + " thưc dậy lúc 7h");
//            }
//        }
//
////        break
//                for (int day = 1 ; day <=30 ;day ++){
//            if (day==20){
//                System.out.println("ko lam nữa");
//                break;
//            }
//                    System.out.println("Ngày " + day + " thưc dậy lúc 7h");
//        }
////                continue:nghỉ ngày cuối tuần
//        for (int day = 1 ; day <=30 ;day ++){
//            if (day%7==0){
//                System.out.println("nghi");
//                continue;
//            }
//            System.out.println("Ngày " + day + " thưc dậy lúc 7h");
//        }

//        tính tổng tiền tiết kiệm
//    trong vong 10 ngày mỗi ngày tiết kiệm 100k
//        khi chưa bắt đầu thì số tiền đang có là 0k
//    int money=0;
//    for(int day =1 ; day<=10 ; day++){
//        money =money +100000;}
//        System.out.println("số tiền tiết kieemk đc là :"+ money);

//        ramdom n số ngầu nhiên trong khoảng 0-->100.nhập từ bàn phím
        Scanner sc=new Scanner(System.in);
        Random rd= new Random();
        System.out.println("Bạn muốn ramdom nhiêu số");
        int count = sc.nextInt();


        for (int i = 0; i < count; i++) {
            int numberRamdom = rd.nextInt(100);
            System.out.print(numberRamdom + "\t"  );

            if (numberRamdom >90){
                break;
            }

        }





    }
}
