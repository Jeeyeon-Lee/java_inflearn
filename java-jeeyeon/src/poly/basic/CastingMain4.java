package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
//        Child child1 = parent1;
        Child child2 = (Child)parent1;
        child2.childMethod();

        Parent parent2 = new Parent(); //이 안에 child가 없어!
        Child child3 = (Child)parent2; //이렇게 하는 건 가능하지만
        child3.childMethod();          //그 안에 그 메소드가 없어
    }
}
