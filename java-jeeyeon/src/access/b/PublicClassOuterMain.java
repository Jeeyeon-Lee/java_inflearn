package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        //access.a 에 있는 defaultclass이기 때문에 접근할 수 없음!!
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();
    }
}
