package poly.ex3;


public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        dog.sound();
        cat.sound();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물소리테스트 시작");
        animal.sound();
        System.out.println("동물소리테스트 종료");
    }
}
