import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LOCALDATEDEMO {
    public static void main(String[] args) {
//        laays ngafy hieenj taij
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
//        chỉ định ngày
        LocalDate ld1 = LocalDate.of(2022,9,11);
        System.out.println(ld1);

//        lấy ra năm hiện tại
        System.out.println("Năm hiện tại :" + ld.getYear());
        System.out.println("Tháng hiện tại : " + ld.getMonth().getValue());
        System.out.println(ld.getDayOfMonth());

//        thay đổi thời gian
        System.out.println(ld.plusYears(2));
        System.out.println(ld.minusMonths(2));
        System.out.println(ld.getYear()+"có là năm nhuận ko : "+ld.isLeapYear());
        System.out.println(ld.plusYears(2).getYear()+"có là năm nhuận ko : " +ld.plusYears(2).isLeapYear());

//        so sánh
        System.out.println(ld.equals(ld1));
        System.out.println(ld.isBefore(ld1));
        System.out.println(ld.isAfter(ld1));

//        format định dạng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        áp dụng cho ld
        String stDate = ld.format(formatter);

        System.out.println(stDate);

    }
}
