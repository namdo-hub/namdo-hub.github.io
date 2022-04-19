public class Main {
//    bien global
   public static int globalVariable=20;
    public static void main(String[] args) {
//        chuong trinh dau
        System.out.println("hello world");

//        Khai bao bien
        String firstName, lastName;
//                khoi tao gia tri
        firstName = "Bui";
        lastName = "nam";

//    in ra bien
        System.out.println(firstName);
        System.out.println(lastName);

//     Vua khai bao vua khoi tao gia tri bien
        String fullName = firstName + " "+lastName;
        System.out.println(fullName);

        int age = 25;
        System.out.println(" xin chao cac ban , toi ten la " + fullName + " minh sinh nam "
         +(2022-25)+ " va nam nay minh" + age +" tuoi ");

//        kieu long
        long money = 2_000_000_000L;
        System.out.println("tai khoan ko co g ngoai tien" +  money  +"ty thoi");

//        kieu boilean
        boolean isMarried = false;
        System.out.println("isMarry =" + isMarried + "chua lay vo");
        System.out.println("isMarry =" + !isMarried + "da lay vo");

//        kai bao dau phai dong
        float weight =70.5f ;
        double height = 1.7;

        System.out.println("can nang =" +weight);
        System.out.println("chieu cao =" +height);

//        kieu ky tu search ASCII
        char charA = 'A';
        char chara = 97;
        System.out.println(charA);
        System.out.println(chara);

//        ep kieu ngam mac dinh : tu nho den lon(bien dich lam ho)
        int number = 10;
        long number1 = number ;
        double number2 = number;
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);

//        ep kieu tuong minh tu lon sang nho
        double heightValue =1.8;
        int heightValueConvert = (int) heightValue;

        System.out.println(heightValueConvert);

//        pham vi bien
        {
            int localVariable =10;
            System.out.println(localVariable);
        }

//        bien global
        System.out.println(globalVariable);

    }

}