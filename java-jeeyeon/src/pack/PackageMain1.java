package pack;

import pack.a.User;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        //다른 패키지를 생성하기 위해서는 import를 하거나 아래 처럼 경로를 입력
        pack.a.User user1 = new User();
        User user2 = new User();
    }
}
