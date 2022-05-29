package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyClass <T>{
    private T obj;
//      methos gẻnes
    public void demoMethod(T data){
        System.out.println("Demo method");
        System.out.println("data" + data);



    }

    public <U extends Number> void demoMethod1(U data){
        System.out.println("demo method1");
        System.out.println();
    }
    public static void main(String[] args) {
//        khởi tạo interger
        MyClass<Integer>myClass=new MyClass<>(10);
        System.out.println(myClass.getObj());
        myClass.demoMethod(20);
//        khơi tạo đối tượng String.
        MyClass<String>myClass1=new MyClass<>("nam");
        System.out.println(myClass1.getObj());

//        kiểu giữu kiệu từ number
        MyClass<? extends Number>myClass2=new MyClass<>(10.5);
        System.out.println(myClass2.getObj());
        myClass2.demoMethod1(2000);


//        khởi tạo kiểu Student
        MyClass<Student>myClass3=new MyClass<>(new Student("donam",23));
        System.out.println(myClass3.getObj());

//

    }
}
