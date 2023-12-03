package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // data가 null
        System.out.println(data.value);
    }
}
