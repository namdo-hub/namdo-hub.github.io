package demo_exception;

public class DemoCustomextenion {
    public static void main(String[] args) {
        try {
            findElement(6);
        }catch (NotFoundExtention e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean findElement(int value){
        int[] numbers={1,2,3,4,5};
        for (int number:numbers){
            if (number==value){
                return true;
            }
        }
        throw new NotFoundExtention("ko tim thay gia tri"+value);
    }
}
