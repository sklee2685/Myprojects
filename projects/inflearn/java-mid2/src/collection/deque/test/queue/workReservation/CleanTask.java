package collection.deque.test.queue.workReservation;

public class CleanTask implements Task{
    @Override
    public void execute() {
        System.out.println("사용하지 않는 자원 정리...");
    }
}
