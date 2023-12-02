package basic.start_ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 6.1;
        if(rating <= 9){
            System.out.println("어바웃 타임 추천");
        }
        if(rating <=8){
            System.out.println("토이스토리 추천");
        }
        if(rating <=7){
            System.out.println("고질라 추천");
        }
    }
}
