package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        //사용자 입력값으로 계산해보기
        Scanner sc = new Scanner(System.in);
        //입력할 주문의 개수 입력하세요.
        System.out.print("입력할 주문의 개수 입력하세요.");
        int count = sc.nextInt();
        sc.nextLine();
        //입력한 갯수만큼 배열 생성
        ProductOrder[] orders = new ProductOrder[count];
        //입력값 받기(for문 사용)
        for(int i=0;i<orders.length;i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요");

            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine(); //입력버퍼 비우기 위한 코드???

            orders[i] = createOrder(productName,price,quantity);
        }
        //printOrder()
        printOrders(orders);
        //getTotalAmount()
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: "+totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
