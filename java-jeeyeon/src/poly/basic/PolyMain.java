package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();
        System.out.println("===========");

        Child child1 = new Child();
        System.out.println("Child -> Child");
        child1.childMethod();
        child1.parentMethod();
        System.out.println("===========");

        Parent child = new Child();
        System.out.println("Parent -> Child");
        child.parentMethod();
//        child.childMethod();
//        Child child1 = new Parent(); 자식이 부모 생성 x
    }
}
