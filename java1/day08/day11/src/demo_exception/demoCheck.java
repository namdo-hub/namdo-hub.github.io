package demo_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demoCheck {
    public static void main(String[] args) throws FileNotFoundException {
//        khởi tạo một đối tương file
        File file=new File("text.txt");

//        đọc file
        FileReader fileReader=new FileReader(file);
    }
}
