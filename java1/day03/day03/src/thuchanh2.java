import java.util.Scanner;

public class thuchanh2 {
        public static void Mark(){
                Scanner sc =new Scanner(System.in);
                double mark = sc.nextDouble();
                if (mark>=85){
                        System.out.println("A");
                }
                if (mark>=70 && mark <85){
                        System.out.println("b");
                }
                else {
                        System.out.println("c");
                }

        }




}
