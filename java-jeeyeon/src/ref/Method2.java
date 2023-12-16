package ref;

public class Method2 {
    public static void main(String[] args) {
        //4단계 : 생성하면서 바로 초기화 & 반환해주기
        Student student1 = createStudent("학생1", 15, 90);
        printStudent(student1);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2", 16, 80);
        printStudent(student2);
        System.out.println("student2 = " + student2);

    }
    static void printStudent(Student student){
        System.out.println("이름"+student.name+"나이"+student.age+"성적"+student.grade);
    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        //밖에서 쓸 수 있게 객체를 반환해줘야 함. -> 이 참조값을 내보내서 다른 것에 활용!
        return student;
    }
}
