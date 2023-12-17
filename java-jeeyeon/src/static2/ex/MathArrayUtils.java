package static2.ex;

public class MathArrayUtils {
    //요구사항.
    //이 클래스를 생성하지 못 하게 막기! 어떻게? private? protected? 으로 생성자 막기
    //의도를 다른 개발자에게도 보이게 하기 막기->아, 스태틱으로 사용하는구나!
    private MathArrayUtils() {
    }

    public static int sum(int[] array){
        int total =0;
        for(int value : array){
            total += value;
        }
        return total;
    }
    public static double average(int[] array){
        return (double)(sum(array))/array.length;
    }
    public  static int min(int[] array){
        int minValue = array[0];
        for(int value : array){
            if(value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }

    public  static int max(int[] array){
        int maxValue = array[0];
        for(int value : array){
            if(value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
