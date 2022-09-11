import java.util.Comparator;
import java.util.PriorityQueue;

public class _38PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Initially small element has less priority
        // So internally it is implementing min heap, so min heap can be implemented by priority queue


        pq.offer(12);
        pq.offer(13);
        pq.offer(1);
        // This would remove 1
        pq.poll();

        // We can change the priority by comparator
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
    }
}
