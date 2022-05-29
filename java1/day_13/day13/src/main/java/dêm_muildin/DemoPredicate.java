package dêm_muildin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("an");
        names.add("nam");
        names.add("do");


//        xóa name tên "An"
        names.removeIf(name->name.equals("An"));
        names.forEach(System.out::println);

//        xóa 1 name tên nam
        Predicate<String>predicate=new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("nam");
            }
        };
        names.removeIf(predicate);
        names.forEach(System.out::println);
        List<Integer>numbers= Arrays.asList(1,2,3,4,5);
        List<Integer>result=getNumberisOdd(numbers,(a)->a%2==1);

        System.out.println();
        result.forEach(System.out::println);

    }
    public static List<Integer>getNumberisOdd(List<Integer>numbers,Predicate<Integer>predicate){
        List<Integer>list=new ArrayList<>();
        for (Integer n:numbers){
            if (predicate)
        }
    }
}
