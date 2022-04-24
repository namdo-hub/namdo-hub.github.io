public class operatorDemo {
    public static void main(String[] args) {
        int a = 30;
        int b = 10;
//        toán tử
//c=a suy ra c=30
//        a tang len 1-->a=31
        int c=a++;
        System.out.println(c);
        System.out.println(a);

//        a tăng lên 1=>a=3
//        d=a=32;
        int d=++a;
        System.out.println(d);
        System.out.println(a);
        int e=a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);

        int f=++a + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);

//        ví dụ &&
        boolean coTien = true;
        boolean troiDep = true;

        System.out.println(coTien && troiDep);

//        toanr tuwr hoawcj ||
        System.out.println(!coTien || !troiDep);

        int number=20;
        number =number +10;
        number +=10;


    }
}
