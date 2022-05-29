package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

interface InterfaceGeneric<T extends Number>{
    void add(T obj);

    void remove(T obj);
    void print();

}
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DemoGenericInterface<T extends Number>implements InterfaceGeneric<T> {
    private List<T> list;

    @Override
    public void add(Number obj) {
        list.add((T) obj);
    }

    @Override
    public void remove(Number obj) {

    }

    @Override
    public void print() {

    }

    public static void main(String[] args) {
        InterfaceGeneric<Integer> interfaceGeneric=new DemoGenericInterface(new ArrayList<>());

//        Add
        interfaceGeneric.add(1);
        interfaceGeneric.add(2);
        interfaceGeneric.print();

//        xóa
        interfaceGeneric.remove(2);
        interfaceGeneric.print();

//        list student




    }
}
