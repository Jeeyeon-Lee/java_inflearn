package static2;


import static static2.DecoData.staticCall;

public class DecoMain3 {
    public static void main(String[] args) {
        //인스턴스를 통한 접근은 역시 메소드도 가능하다.
        //but, 굳이..?? 가시적이지 않음.
        DecoData data1 = new DecoData();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
    }
}
