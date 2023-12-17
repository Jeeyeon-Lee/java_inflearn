package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
//        data1 = 30;
        final int data2 = 10;
//        data2 = 30;

    }
    static void method(final int parameter){
//        parameter = 20; 인수로 넘긴 그 값으로 고정됨. 중간에 고칠 수 없음.
    }
}
