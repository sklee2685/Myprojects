package collection.link;

public class NodeMain1 {// LinkedList 구현

    public static void main(String[] args) {
        //노드를 생성하고 연결하기: 노드 A -> 노드 B -> 노드 C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        System.out.println("first.item = " + first.item);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next.item = " + first.next.next.item);

        // 간단하게
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }

    }
}
