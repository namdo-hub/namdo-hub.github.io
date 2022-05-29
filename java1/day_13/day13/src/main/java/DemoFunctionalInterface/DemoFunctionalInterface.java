package DemoFunctionalInterface;
@FunctionalInterface
interface Greeting{
    void sayHello();
}

public class DemoFunctionalInterface implements Greeting {

    @Override
    public void sayHello( ) {
        System.out.println("Xin chảo");

    }

    public static void main(String[] args) {
//        khai báo interface sử dụng implement
        Greeting g=new DemoFunctionalInterface();
        g.sayHello();
    }
//    cachs Sử dụng anomymus
    Greeting g1=new Greeting() {
    @Override
    public void sayHello() {

    }

    public void sayHello(String name){
        System.out.println("Xin cha"+name);
    };

};


}
