package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A",counter);
        System.out.println("A count = " + counter.count);
        System.out.println(counter);
        System.out.println(data1);
        Data2 data2 = new Data2("B",counter);
        System.out.println("B count = " + counter.count);
        System.out.println(counter);
        System.out.println(data2);
        Data2 data3 = new Data2("C",counter);
        System.out.println("C count = " + counter.count);
        System.out.println(counter);
        System.out.println(data3);
        counter = new Counter();
        Data2 data4 = new Data2("D",counter);
        System.out.println("D count = " + counter.count);
        System.out.println(counter);
        System.out.println(data4);


    }

}
