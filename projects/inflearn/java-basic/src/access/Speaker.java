package access;

public class Speaker {
    private int volume; //기존 코드 int volume

    //main에서 입력 받은 값을 받아와 int형 변수 volume에 초기화
    Speaker(int volume) {
        this.volume = volume;
    }

    // 음량 10씩 증가 및 최대 음량 표시
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }

    }

    // 음량 10씩 감소 및 최소 음량 표시
    void volumeDonw() {
        if (volume <= 0) {
            System.out.println("최소 음량입니다.");
        } else {
            volume -= 10;
            System.out.println("음량을 10 감소합니다.");
        }
    }

    //현재 음량 표기
    void showVolume() {
        System.out.println("현재 음량: "+volume);
    }
}
