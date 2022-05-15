public class Calculator {
    public int number1;
    public int number2;

    public void printInfo(){
        System.out.println(number1);
    }
    public int addition(){

        return number1+number2;
    }
    public int subtract(){
        return number1-number2;
    }
    public int multi(){
        return number1*number2;
    }
    public double division(){
        return number1/number2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
