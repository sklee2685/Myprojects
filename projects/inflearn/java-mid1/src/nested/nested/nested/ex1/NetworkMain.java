package nested.nested.nested.ex1;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");
    }
}
/*
문제점
`Network`, `NetworkMessage`코드를 작성한 사람이 아닌 다른 사람이 해당 코드를 사용하려고 할때
둘다 사용해야하는지 등 여러가지 생각을 할 것이다. 그렇게 두 클래스를 모두 확인하고 나서, `Network`만 사용하면 되는지 이해하게 됨
지금은 간단한 코드 이지만, 복잡한 코드일 경우 시간적 소모가 큼

이를 해결하기 위해 정적 중첩 클래스를 사용
 */
