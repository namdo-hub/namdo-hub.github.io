package dêm_muildin;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class DemoFuncion {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("an");
        names.add("nam");
        names.add("do");

        names.forEach(System.out::println);

        Function<String,String> function=new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        };
        names.stream().map(function).forEach(System.out::println);

//        cách 2 dùng lanbda
        names.stream().map(name->name.toLowerCase(Locale.ROOT)).forEach(System.out::println);
//        cách 3 method rẻence
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
