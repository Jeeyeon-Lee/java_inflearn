package basic.start_ex;

public class OperationEx2 {
    double num1 = 1.5;
    double num2 = 1.5;
    double num3 = 1.5;
    double sum = num1+num2+num3;
    double average = sum/3;
    public static void main(String[] args) {
        OperationEx2 o1 = new OperationEx2();
        System.out.println(o1.sum);
        System.out.println(o1.average);
    }
}
