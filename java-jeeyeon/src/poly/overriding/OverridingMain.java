package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식- 자식
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("child.value = " + child.value);
        child.method();

        System.out.println("==================================");
        //부모-부모
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();
        System.out.println("==================================");
        //부모-자식
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("parent1.value = " + poly.value);
        poly.method();
    }
}
