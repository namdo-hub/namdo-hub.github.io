package dêm_muildin;

import java.util.List;
import java.util.function.Consumer;

public class Demobuild {
    public static void main(String[] args) {
        List<String>names=List.of("an","nam","do");
//        cách1 lambda
        names.forEach(name-> System.out.println(name));
//        cách2
        names.forEach(System.out::println);
//        cách3
//        khai báo cómummer
        Consumer<String>consumer=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        names.forEach(consumer);
    }
}
