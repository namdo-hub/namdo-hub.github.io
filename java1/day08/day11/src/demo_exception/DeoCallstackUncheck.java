package demo_exception;

public class DeoCallstackUncheck {
    public static void main(String[] args) {
        methodThree();

        System.out.println("code continue");
    }
    public static void methodOne(){
        throw new ArithmeticException("lỗi toan hoc");

    }
    public static void methodTwo(){
        methodOne();
    }
    public static void methodThree(){
       try {
           methodTwo();
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
    }
}
