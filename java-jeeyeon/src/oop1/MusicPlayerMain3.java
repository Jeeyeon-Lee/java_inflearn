package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        data.volume =0;
        //플레이어 켜기
        on(data);
        //볼륨증가
        volumeUp(data);
        //볼륨증가
        volumeUp(data);
        //볼륨감소
        data.volume --;
        volumeDown(data);
        //플레이어 상태
        showStatus(data);
        //플레이어 끄기
        off(data);
    }
//    메소드로 생성하기!!(중복제거, 메소드만 수정, 메소드 이름 추가)
    //켜기, 끄기
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악플레이어를 시작합니다. ");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악플레이어를 종료합니다. ");
    }
    //볼륨
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("volume = " + data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("volume = " + data.volume);
    }
    //상태출력
    static void showStatus(MusicPlayerData data){
        System.out.println("음악플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악플레이어 on, 볼륨 :"+data.volume);
        }else{
            System.out.println("음악플레이어 off");
        }
    }
}
