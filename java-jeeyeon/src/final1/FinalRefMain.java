package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //객체를 final로 생성한다?? 더는 다른 값을 담을 수 없음. 
        //참조 대상의 값은 변경이 가능!! 
        data.value = 30;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);
    }
}
