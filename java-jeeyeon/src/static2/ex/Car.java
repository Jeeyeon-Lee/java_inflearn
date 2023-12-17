package static2.ex;

public class Car {
    private String carName;
    static int buyCar;
    public Car(String carName) {
        System.out.println("차량 구입, 이름 : "+ carName);
        this.carName = carName;
        buyCar++;
    }
    //구매한 차량 수 출력 static 메소드
    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + buyCar);
    }
}
