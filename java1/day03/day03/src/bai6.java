import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        print();

    }

    public static void print(){
        for (int i = 0; i <100 ; i++) {
            if (i%5==0 && i%3==0){
                System.out.println("BUZZFIZZ");
            }

            else if (i%5==0){
                System.out.println("BUZZ");
            }

            else if (i%3==0){
                System.out.println("Fizz");
            }

            else {
                System.out.println(i);
            }
        }

    }
}
