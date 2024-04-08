package oop1;

public class MusicPlayerMain2 {//절차 지향 프로그래밍2 - 데이터 묶음
    //이전 코드를 점진적으로 변경해보자.

    /*
    문제: 음악 플레이어 만들기
    음악 플레이어를 만들어보자.
    **요구 사항:**
    1. 음악 플레이어를 켜고 끌 수 있어야 한다.
    2. 음악 프레이어의 볼륨을 증가, 감소할 수 있어야 한다.
    3. 음악 플레이어의 상태를 확인할 수 있어야 한다.
    **예시 출력:**
    ```
    음악 플레이어를 시작합니다
    음악 플레이어 볼륨:1
    음악 플레이어 볼륨:2
    음악 플레이어 볼륨:1
    음악 플레이어 상태 확인
    음악 플레이어 ON, 볼륨:1
    음악 플레이어를 종료합니다
     */
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        //볼륨증가
        data.volume++;

        System.out.println("음악 플레이어 볼륨: " + data.volume);

        //볼륨증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        //불륨감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        //음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
