package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        //static은 클래스 단위 접근이기 때문에(공유되기에) 같은 값에 +1 이 되어감.
        //instanceValue는 새로 생성된 인스턴스에 접근하는 것이기 때문에 초기화됨
        System.out.println("1.정적 호출");
        DecoData.staticCall();

        System.out.println("2.인스턴스 호출 1");
        DecoData data = new DecoData();
        data.instanceCall();

        System.out.println("3.인스턴스 호출 2");
        DecoData data1 = new DecoData();
        data1.instanceCall();
    }
}
