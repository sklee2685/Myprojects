package collection.link;

public class Node {//LinkedList 구현
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    // 노드의 연결 상태를 더 편하게 보기

    /*
    // IDE를 사용해 생성한 toString()
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
    */

    // [A->B->C] 모양으로 출력
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
