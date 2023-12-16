package oop1.ex;

public class Account {
    int balane; //잔액
    void deposit(int amount){
        balane = balane + amount;
    }
    void withdraw(int amount){
        if(balane>=amount){
            balane = balane - amount;
        }else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
