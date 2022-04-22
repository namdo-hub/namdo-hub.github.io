public class PrintDemo {
    public static void main(String[] args) {
        System.out.println("My name is Nam");
        System.out.print("My name is Nam\n " );
        System.out.print("\t\tim fine\n");

        System.out.printf("My name is %s. Im %d year old.Point=%.2f\n ", "hien",25,9.98945);

//        bảng dữ liệu
//        name emdail age
        System.out.printf("%-20s %-20s %-10s\n","họ tên","email","tuổi");
        System.out.printf("%-20s %-20s %-10d\n","nam","namdo@gmail.com",22);
        System.out.printf("%-20s %-20s %-10d\n","namdo","namd@gmail.com",29);
        System.out.printf("%-20s %-20s %-10d","namzd","namo@gmail.com",20);
    }
}
