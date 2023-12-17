package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent)child; //업캐스팅은 (부모) 생략 가능, 권장
        Parent parent2 = child; // 생략 가능

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
