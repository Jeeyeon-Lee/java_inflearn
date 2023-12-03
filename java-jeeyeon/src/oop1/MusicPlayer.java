package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;
    //    메소드로 생성하기!!(중복제거, 메소드만 수정, 메소드 이름 추가)
    //켜기, 끄기
    void on(){
        isOn = true;
        System.out.println("음악플레이어를 시작합니다. ");
    }
    void off(){
        isOn = false;
        System.out.println("음악플레이어를 종료합니다. ");
    }
    //볼륨
    void volumeUp(){
        volume++;
        System.out.println("volume = " + volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("volume = " + volume);
    }
    //상태출력
    void showStatus(){
        System.out.println("음악플레이어 상태 확인");
        if(isOn) {
            System.out.println("음악플레이어 on, 볼륨 :"+volume);
        }else{
            System.out.println("음악플레이어 off");
        }
    }
}
