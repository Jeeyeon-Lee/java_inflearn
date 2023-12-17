package extends1.overriding;

public class ElectricCar extends Car {
    public void charge(){
        System.out.println("충천합니다.");
    }
    @Override //부모의 기능을 재정의하여 사용
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
