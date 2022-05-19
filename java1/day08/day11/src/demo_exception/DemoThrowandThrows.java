package demo_exception;

import java.io.IOException;

public class DemoThrowandThrows {
    public static void main(String[] args) {
        try {
            validate(18);
            validate(16);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("code continue");

        try {
            demo();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void validate(int age){
        if (age<18){
            throw new ArithmeticException("ko dủ tuổi đi nghĩa vụ quân sự");
        }
        System.out.println("Đủ tuổi đi nghĩa vụ quân sự");
    }
    public static void demo() throws IOException {
        throw new IOException("ko tim thay file ...");
    }
}
