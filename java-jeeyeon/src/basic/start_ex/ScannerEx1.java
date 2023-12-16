package basic.start_ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count=0;
        int input=0;
        System.out.println("숫자를 입력하세요. 입력 중단하려면 -1 입력하세요");
  /*      while(true){
            input = sc.nextInt();
            if(input==-1){
                break;
            }
            sum += input;
            count ++;
        }*/

        while ((input = sc.nextInt())!= -1){
            sum += input;
            count ++;
        }
        double avg = sum/count;
        System.out.println("합계는 "+sum+" 입니다.");
        System.out.println("평균값은 "+avg+" 입니다.");
    }
}
