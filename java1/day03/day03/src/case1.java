public class case1 {
    public static void main(String[] args) {
        int money=17000;

//        menu
        switch (money){
            case 12000 :
            case 15000 :
            case 17000: {
                System.out.println("ca phê sữa");
                break;
            }
            case  10000 : {
                System.out.println("cà phê đá");
                break;
            }
            case  8000 : {
                System.out.println("String");
                break;
            }
            case  2000 : {
                System.out.println("trà đá");
                break;
            }
            default: {
                System.out.println("ko có đồ uống phù hợp");
                break;
            }

        }
    }
}
