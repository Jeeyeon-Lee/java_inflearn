package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1",15,90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2",16,80);

        MemberInit[] members = {member1, member2};
        for(MemberInit s : members){
            System.out.println("이름:"+s.name+" 나이:"+s.age+" 성적"+s.grade);
        }
    }
}
//멤버가 자기 자신의 데이터를 변경하는 기능을 제공하는 것이 좋다??
//Memberinit으로 메소드 이동하여 수정