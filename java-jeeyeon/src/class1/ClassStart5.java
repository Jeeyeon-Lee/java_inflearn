package class1;

public class ClassStart5 {
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
        Student[] students = new Student[]{student1, student2}; //참조값을 가짐

        for(int i=0;i<students.length;i++) {
            System.out.println(students[i].name + ", " + students[i].age + ", " + students[i].grade);
        }
        for(int i=0;i<students.length;i++) {
            Student s = students[i];
            System.out.println(s.name + ", " + s.age + ", " + s.grade);
        }
        /* 향상된 for문 => iter */
        for(Student s : students){
            System.out.println(s.name + ", " + s.age + ", " + s.grade);
        }
    }
}
