package oop1;

public class MusicPlayer {//객체 지향 프로그래밍
    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();

        //음악 플레이어 켜기
        player.on();

        //볼륨증가
        player.volumeUp();

        //볼륨증가
        player.volumeUp();

        //불륨감소
        player.volumeDown();

        //음악 플레이어 상태
        player.showStatus();

        //음악 플레이어 끄기
        player.off();

    }
}
