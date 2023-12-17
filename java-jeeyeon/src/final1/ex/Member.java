package final1.ex;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void changeData(String name){
//        this.id = id; final인 값은 바꿀 수 없으니 오류 발생!!
        this.name = name;
    }
    public void print(){
        System.out.println("id = " + id + "name = " + name );
    }
}
