package model1;

public class Main {
    public static void main(String[] args) {
        Bookservice bookservice=new Bookservice();

        for (Book book:bookservice.getBooks()) {
            System.out.println(book);
        }

        bookservice.findByTittle("khốn khổ");
    }
}
