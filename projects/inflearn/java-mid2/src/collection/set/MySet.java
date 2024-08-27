package collection.set;

public interface MySet<E> { //직접 구현하는 Set -제네릭, 인터페이스 도입
    boolean add(E element);

    boolean remove(E value);

    boolean contains(E value);
}
