package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        //생성자1(3개값)
        MemberConstructor member1 = new MemberConstructor("user1", 15,90);

        //생성자2(2개값, 1개의 사전 정의값
        MemberConstructor member2 = new MemberConstructor("user2", 16);
        MemberConstructor[] members = {member1, member2};
        for (MemberConstructor s : members){
            System.out.println("name = " + s.name + ", age = " + s.age + ", grade = " + s.grade);
        }
    }
}
