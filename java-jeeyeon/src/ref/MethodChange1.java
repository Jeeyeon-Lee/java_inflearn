package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a); //10
        /*여기서 파라미터로 a값인 10을 메소드를 전달함 -> 따라서 값은 10*/
//        값을 넘긴 것으로는 해당 변수에 접근 x
        changePrimitive(a);
        System.out.println("a = " + a); //10
        System.out.println("a = " + a); //10
    }
        static void changePrimitive(int x){
            x = 20;
        }

}
