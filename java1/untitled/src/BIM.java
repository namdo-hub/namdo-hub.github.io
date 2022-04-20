public class BIM {


    public static void main(String[] args) {

        BIM b = new BIM();
        float weight = 70f;
        double height = 1.7;

        System.out.println("Cân nặng = " + weight);
        System.out.println("Chiều cao = " + height);

        double BMI=b.divide(70,2.89 );
        System.out.println(BMI);
        System.out.println("Nguy cơ béo phì ");


    }

    public double divide(int weight, double height) {
        double BMI= weight/height;
        return BMI;
    }
}