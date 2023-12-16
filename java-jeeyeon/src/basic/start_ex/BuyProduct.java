package basic.start_ex;

import java.util.Scanner;

public class BuyProduct {
    public static void main(String[] args) {
        /*사용자로부터 상품정보 : 상품명, 가격, 수량 입력받기
        * 이들의 총 가격을 출력하는 프로그램
        * 세 가지 옵션 1. 상품 입력, 2. 결제, 3. 프로그램종류*/
        Scanner sc = new Scanner(System.in);
        int totalCost = 0;
        while(true){
            System.out.println("1. 상품입력, 2. 결제, 3. 프로그램 종류");
            int option = sc.nextInt();
            if(option ==1){
                sc.nextLine();
                System.out.println("상품명을 입력하세요.");
                String product = sc.nextLine();
                System.out.println("가격을 입력하세요.");
                int price = sc.nextInt();
                System.out.println("구매수량을 입력하세요.");
                int quantity = sc.nextInt();
                totalCost += price * quantity;
                System.out.println("상품명 : "+product + " 가격 : " +price+" 수량 : " + quantity + "합계 : " + (price*quantity));
            }else if(option ==2){
                System.out.println("총 비용 : "+totalCost);
                totalCost = 0;
            }else if(option ==3){
                System.out.println("프로그램 종료합니다");
                break;
            }else{
                System.out.println("올바른 옵션을 입력하세요.");
            }
        }
    }
}
