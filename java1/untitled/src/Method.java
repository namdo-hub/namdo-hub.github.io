public class Method {
    public static void main(String[] args) {



        Method m = new Method();



        int nam = m.sum(7, 2);
        System.out.println(nam);
//        trừ
        int tru = m.subtract(9,2);
        System.out.println(tru);
//        nhân
        int nhan = m.multi(9,2);
        System.out.println(nhan);
//        chia
        int chia =m.divide(9,3);
        System.out.println(chia);


    }
    public int sum(int a,int b){
        int nam = a+b;
        return nam ;

    }
    public int subtract(int a,int b){
        int tru =a-b;
        return tru;
    }
    public int multi(int a,int b){
        int nhan =a*b;
        return nhan;
    }
    public int divide(int a,int b){
        int chia =a/b;
        return chia;

    }



    }






