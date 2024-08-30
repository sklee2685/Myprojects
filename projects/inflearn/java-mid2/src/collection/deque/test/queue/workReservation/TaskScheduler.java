package collection.deque.test.queue.workReservation;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task work) {
        tasks.offer(work);
    }

    public void processNextTask() {
        Task task = tasks.poll();
        if (task != null) {
            task.execute();
        }
    }

    public int getRemainingTasks() {
        return tasks.size();
    }

}
