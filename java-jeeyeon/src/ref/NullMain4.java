package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); //0
        System.out.println("bigData.data = " + bigData.data); //null

        System.out.println(bigData.data.value); //null. -> 에러 발생
        bigData.data = new Data();              //객체 생성, 참조값 생김
        System.out.println(bigData.data.value); //0
    }
}
