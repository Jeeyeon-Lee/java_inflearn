package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        /*2개의 값이 들어가는 배열을 생성하여 객체를 대입함!*/
        Student[] students = new Student[2]; //참조값을 가짐
        students[0] = student1;//대입됨 ->배열의 첫 번째 항목에 대입된 객체를 복사하여 전달
        students[1] = student2;//대입됨 ->배열의 두 번째 항목에 대입된 객체를 복사하여 전달

        System.out.println(students[0].name+", "+students[0].age+", "+students[0].grade);
        System.out.println(students[1].name+", "+students[1].age+", "+students[1].grade);
    }
}
