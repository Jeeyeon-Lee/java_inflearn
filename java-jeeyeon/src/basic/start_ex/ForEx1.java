package basic.start_ex;

public class ForEx1 {
    public static void main(String[] args) {
 /*       for (int i = 2, count = 1; count < 10; i += 2, count++) {
            System.out.println(i);
        }*/
        int num = 2;
        for(int count = 1; count<=10;count++){
            System.out.println(num);
            num +=2;
        }
    }
}