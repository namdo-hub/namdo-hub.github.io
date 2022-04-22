public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        khai báo kiểu litteral(giá trị thể hiện chính nó
        String name ="nam";
        String name1 ="nam";

//        khởi tạo bằng new sinh ra đối tượng
        String message= new String("Xin chào");
        String message1= new String("Xin chào");
        System.out.println(name);
        System.out.println(message);
//      == được sử dụng cho kiểu dữ liệu nguyên thủy
        System.out.println(name==name1);
        System.out.println(message==message1);
//    equal so sánh về kí tự
        System.out.println(name.equals(name1));
        System.out.println(message.equals(message1));

//        Methos String
        String text = "Xin chào các bạn";
        System.out.println("In hoa chữ : " +text.toUpperCase());
        System.out.println("In thường chữ : " +text.toLowerCase());
        System.out.println("Độ dài chuỗi :" + text.length());
        System.out.println("Ký tự đầu của chuỗi :" + text.charAt(0));
        System.out.println("Ký tự cuối của chuỗi :" + text.charAt(text.length()-1));
        System.out.println("Chuối ch có chỉ số bắt đầu là :" + text.indexOf("ch"));
        System.out.println("Chuỗi hi có tồn tại trong chuỗi băn đầu ko "+ text.contains("hi"));

        System.out.println("cắt chuỗi xin :" + text.substring(0,3));
        System.out.println("cắt chuỗi chào các bạn : "+ text.substring(4));









    }
}