package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        //다 주소가 다른 인스턴스로 생김
        //생기고 +1이 되니까 모두가 다 1인 값을 가짐.
        //not 1, 2, 3
        //위 값이 나오려면 하나씩 참조하게 만들면 같은 변수를 공유하니까! 그렇게 하면 됨
        Data1 data1 = new Data1("A");
        System.out.println("data1.count = " + data1.count);
        Data1 data2 = new Data1("B");
        System.out.println("data2.count = " + data2.count);
        Data1 data3 = new Data1("C");
        System.out.println("data2.count = " + data3.count);
    }
}
