package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
        //모든 메인->1->2->2->1->메인메소드 순서대로 다시 종료됨에 따라 GC가 정리함.
    }

    private static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); //생성하며 힙영역에 생김! x001
        method2(data1);                  //x001을 참조로 넘김
        System.out.println("method1 end");
    }

    static void method2(Data data2) {    //참조값 넘겨받음, x001에 접근 가능해짐
        System.out.println("method2 start");
        System.out.println("data.value="+data2.getValue());
        System.out.println("method2 end");
    }
}
