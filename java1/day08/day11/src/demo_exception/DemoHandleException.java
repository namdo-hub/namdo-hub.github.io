package demo_exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoHandleException {
    public static void main(String[] args) {
//        xử lý với trycatch
//        try :chứa code gây ra lloix
//        catch xủ lý lỗi xảy ra
        try {
            double result=10/0;
        System.out.println(result);
        }catch (RuntimeException e){
            System.out.println("Loi xay ra roi xu ly di");
            System.out.println(e.getMessage());
        }
//        xử lý nhiều exception
        try {
            double result=10/0;
        System.out.println(result);

            String text=null;
        System.out.println(text.length());
        }catch (RuntimeException e){
            System.out.println("xay ra loi");
            System.out.println(e.getMessage());
        }
    }
//    Finally:đc chạy cđẻ cả có xảy ra lloix hay ko
//    try {
//        double result=10/0;
//        System.out.println(result);
//    }catch (RuntimeException e){
//        System.out.println("Loi xay ra roi xu ly di");
//        System.out.println(e.getMessage());
//    }finally{
//        System.out.println("code continue");

//    xưt lý check
//        try{
//        File file=new File("text.txt");
//
//
//
//
//        FileReader fileReader=new FileReader(file);
//        BufferedReader bufferedReader=new BufferedReader(fileReader);
//        }catch(FileNotFoundException)

}
