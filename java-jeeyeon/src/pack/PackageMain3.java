package pack;

import pack.a.*;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        User2 userA2 = new User2();
        //같은 이름의 클래스 있는 경우, 하나의 경로만 import 가능
        pack.b.User userB = new pack.b.User();
        pack.b.User2 userB2 = new pack.b.User2();
    }
}