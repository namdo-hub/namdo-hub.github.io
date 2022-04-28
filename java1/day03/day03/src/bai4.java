import java.util.Scanner;
public class bai4 {

        public static void main(String[] args) {
         int data =sum();
            System.out.println(data);

        }
        public static int sum(){
            int sum = 0;


            for (int i = 0; i < 100; i++)
                if (i % 5 == 0){
                    sum =sum+ i;}

            return sum;
        }
    }




