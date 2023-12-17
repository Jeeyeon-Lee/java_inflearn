package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        System.out.println("====================");
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent){
        parent.parentMethod();
        //child 인스턴스인 경우, childMethod() 실행
        if(parent instanceof Child child){ //child 참조하니??
            System.out.println("Child 참조 인스턴스이다.");
            //다운캐스팅 해도 괜찮다.
            child.childMethod();
        }else{ //child 참조 안하니??
            System.out.println("Parent 참조 인스턴스이다.");
        }
    }
}
