package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {//연결된 노드 출력
        //노드를 생성하고 연결하기: 노드 A -> 노드 B -> 노드 C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);
    }
}
