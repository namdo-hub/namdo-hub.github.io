import javax.management.relation.Role;

public class EnumDemo {
//    enum trong nội bộ class
    enum Gender {
        MALE,FEMALE
}
    public static void main(String[] args) {
        enum ROLE{
            ADMIN,USER,SALE,TEACHER
        }


        System.out.println( "Giới tính là" + Gender.MALE);
        System.out.println("giới tính là" + Gender.FEMALE );
        System.out.println("Tôi là" + ROLE.ADMIN +"của môt trang web");
        System.out.println("tháng 4 là " +SESSON.SUMMER);

    }
}
