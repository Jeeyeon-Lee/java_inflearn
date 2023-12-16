package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();
        //default도 다른 패키지이기 때문에 호출 불가!!
//        data.defaultField = 3;
//        data.defaultMethod();
//        data.privateField = 3;
//        data.privateMethod();
        data.innerAccess();
        // 왜 여기 안에 있는 private은 가능한거지/??
        // 왜냐면 저 내부에서 실행되고 가져오는거니까 가능해!! 신기한데..???

    }

}
