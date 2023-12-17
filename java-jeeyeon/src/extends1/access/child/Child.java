package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1;
//        defaultValue = 3; //같은 패키지만 접근 가능
//        privateValue = 10; //접근 불가
        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();
        printParent();
    }
    @Override
    public void protectedMethod(){
        System.out.println("Child.protectedMethod");
    }

}
