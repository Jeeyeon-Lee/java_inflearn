package basic.start_ex;

public class OperationEx1 {
    int num1 = 10;
    int num2 = 20;
    int num3 = 30;
    int sum = num1+num2+num3;
    int average = sum/3;
    public static void main(String[] args) {
        OperationEx1 o1 = new OperationEx1();
        System.out.println(o1.sum);
        System.out.println(o1.average);
    }
}
