package model1;


import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;
        int option = 0;

        while (isContinue) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Nhập vào chuỗi : ");
                    String str = sc.nextLine();
                    System.out.println((str));
                    break;
                }
                case 2: {
                    System.out.print("Nhập vào chuỗi : ");
                    String str = sc.nextLine();
                    System.out.println((str));
                    break;
                }
                case 3: {
                    isContinue = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }
    public static void showMenu() {
        System.out.println("1 - Bài 1");
        System.out.println("2 - Bài 2");
        System.out.println("3 - Thoát chương trình");
    }
    public void findByTittle(String title){
        int count=0;
        for (Book book : getBooks()){
            if (book.title.contains(title)){
                count++;
                System.out.println(book);
            }
        }
        if (count==0){
            System.out.println("ko có sách phù hợp với tên là : " + title);
        }
    }
    }

