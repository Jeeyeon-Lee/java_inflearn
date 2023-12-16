package ref;

public class Method1 {
    public static void main(String[] args) {
        //건별로 생성 하여 하나씩 출력하기(1단계)
        Student s1 = new Student();
        s1.name = "학생1";
        s1.age = 15;
        s1.grade = 90;
        Student s2 = new Student();
        s2.name = "학생2";
        s2.age = 16;
        s2.grade = 80;
        System.out.println("이름"+s1.name+"나이"+s1.age+"성적"+s1.grade);
        System.out.println("이름"+s2.name+"나이"+s2.age+"성적"+s2.grade);

        //메소드 활용 출력(2단계)
        printStudent(s1);
        printStudent(s2);

        //넘겨서 사용해보기(3단계)
        Student s3 = new Student();
        initStudent(s3, "학생3", 15,90);
        printStudent(s3);
        Student s4 = new Student();
        initStudent(s4, "학생4", 16,80);
        printStudent(s4);
    }
    static void printStudent(Student s){
        System.out.println("이름"+s.name+"나이"+s.age+"성적"+s.grade);
    }
    static void initStudent(Student s,String name, int age, int grade){
        s.name = name;
        s.age = age;
        s.grade = grade;
    }
}
