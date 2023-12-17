package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; //틀에서 틀 호출 가능
        staticMethod();
//        instanceValue;    //instance 변수, 메소드 접근 불가
//        instanceMethod();
    }

    //밖에선 모두가 접근 가능!!
    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }
    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
