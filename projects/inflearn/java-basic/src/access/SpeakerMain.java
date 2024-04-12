package access;

public class SpeakerMain {//접근제어자의 이해1
    /*
    스피커의 음량을 조절하는 프로그램을 만들어보자.
    단, 스피커의 볼륨이 100을 넘으면 고장난다.
     */
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 및 수정");
        //speaker.volume = 200;
        speaker.showVolume();
    }
    /*
    현 문제점
    Speaker 객체를 사용하는 사용자는 Speaker 의 volume 필드와 메서드 모두 접근이 가능
    -> 근본적으로 해결하기 위해서는 volume 필드의 외부 접근을 막을 수 있는 방법이 필요.
    -> 이를 수행해 주는것이 접근 제어자
     */

    /*
    수정 후
    Speaker 클래스에 있는 int voulume을 private int volume;으로 바꿔줌으로써
    외부에서 `volume` 필드에 직접 접근할 수 없게 막음
    ->volume 필드는 이제 Speaker 내부에서만 접근할 수있다.
     */
}
