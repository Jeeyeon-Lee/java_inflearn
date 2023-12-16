package access.ex;

public class MaxCounter {
    private int count =0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        //검증로직 -> 여러 검증로직이 있을 때, return으로 이해 명확히 분리됨.
        if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        //실행로직
        count ++;
    }
    public int getCount(){
        return count;
    }
}
