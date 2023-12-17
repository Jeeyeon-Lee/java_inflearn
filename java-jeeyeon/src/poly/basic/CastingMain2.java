package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        //다운 캐스팅(부모 타입 -> 자식 타입)
        //자바는 안 된다고 하지만, 개발자가 강제로 캐스팅 해버릴 수 있음
        Child child = (Child)poly;
        child.childMethod();

        //일시적 다운캐스팅 - 해당 메소드 호출 순간만 다운캐스팅!
        ((Child) poly).childMethod();
    }
}
