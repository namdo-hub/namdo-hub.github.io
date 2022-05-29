package Demo_lambda;
@FunctionalInterface
interface Calcurato{
    int calcalate(int a,int b);
}
public class DemoCalcalator {
    public static void main(String[] args) {
        //    cộng 2 số
        Calcurato c=(a,b)->a+b;
        System.out.println(c.calcalate(3,4));
        System.out.println(c.calcalate(10,20));

        //    trừ 2 số
        Calcurato c1=(a,b)->a-b;
        System.out.println(c1.calcalate(3,4));
        System.out.println(c1.calcalate(10,20));

        //    nhân 2 số
        Calcurato c2=(a,b)->a*b;
        System.out.println(c2.calcalate(3,4));
        System.out.println(c2.calcalate(10,20));
    }


}
