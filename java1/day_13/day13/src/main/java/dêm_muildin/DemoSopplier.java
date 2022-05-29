package dêm_muildin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DemoSopplier {
    public static void main(String[] args) {
        Random rd=new Random();
        Supplier<Integer>supplier=new Supplier<Integer>() {
            @Override
            public Integer get() {
                return rd.nextInt(100);
            }
        };
        List<Integer>number =Stream.generate(supplier).limit(5).toList();
        number.forEach(System.out::println);

//        cách2
        List<Integer>number1 =Stream.generate(()->rd.nextInt(100)).limit(5).toList();
        number1.forEach(System.out::println);
    }
    public List<Integer> getNumberIsOdd(List<Integer> number, Predicate<Integer>predicate){
        List<Integer>list=new ArrayList<>();
        for (Integer n:number){
            if (predicate.test(n)){
                list.add(n);
            }
        }
        return list;
    }
}

