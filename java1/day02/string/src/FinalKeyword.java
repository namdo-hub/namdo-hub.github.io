public class FinalKeyword {
    public static final int age=30;
    public static void main(String[] args) {


//        vừa khai báo vừa khởi tạo giá trị
        final  String name ="anna";
//       Khai báo hằng số nên viết hoa
        final String FIRST_NAME ="BOB";

//        khai báo trước tạo giá trị sau
        final double PI ;
        PI=3.14;

        System.out.println(name);
        System.out.println(PI);
//        tham chiếu biến global
//        System.out.println(age);
        FinalKeyword f =new FinalKeyword();
        System.out.println(f.age);
//        thay dổi giá trị hằng số  PI=4; ko thực hiện đc

        System.out.println(f.sum(10,25));


    }
    public final int sum(int a,int b) {
        return a+b;
    }
}
