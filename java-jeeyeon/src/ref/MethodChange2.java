package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA = " + dataA);
        System.out.println("dataA = " + dataA.value);

//      객체를 넘겼기 때문에 접근할 수 있는 경로가 생김! 따라서 값이 바뀜
        changeRefernce(dataA);
        System.out.println("dataA = " + dataA);
        System.out.println("dataA = " + dataA.value);
    }
    static void changeRefernce(Data dataX){
        dataX.value = 20;
    }

}
