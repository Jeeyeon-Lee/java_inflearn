package construct;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    MemberConstructor(String name, int age){
        //두번째 생성자를 호출하는 코드 신기하네
        this(name, age, 50);
    }
    MemberConstructor(String name, int age, int grade){
        this.name = name;
        this. age = age;
        this. grade = grade;
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
    }
}
