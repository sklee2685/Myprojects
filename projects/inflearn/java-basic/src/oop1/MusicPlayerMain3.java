package oop1;

public class MusicPlayerMain3 {//절차 지향 프로그래밍3 - 메서드 추출
    /*
    이전 코드를 보면 중복되는 부분들이 있다
    그리고 각각의 기능들은 이후에 재활용 될 가능성이 높다
        음악 플레이어 켜기, 끄기
        볼륨 증가, 감소
        음악 플레이어 상태 출력
    메서드를 사용해서 각각의 기능을 구분해보자.
     */
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);

        //볼륨증가
        volumeUp(data);

        //볼륨증가
        volumeUp(data);

        //불륨감소
        volumeDown(data);

        //음악 플레이어 상태
        showStatus(data);

        //음악 플레이어 끄기
        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static int volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        return data.volume;
    }
    static int volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        return data.volume;
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
/*
각각의 기능을 메서드로 만든 덕분에 각각의 기능이 모듈화 되었다. 덕분에 다음과 같은 장점이 생겼다.
**중복 제거:** 로직 중복이 제거되었다. 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.
**변경 영향 범위:** 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
**메서드 이름 추가:** 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.
 */
}
