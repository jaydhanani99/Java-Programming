import java.util.ArrayDeque;

public class _39DeQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // To get size of dequeue
        dq.size();

        // To check dequeue empty or not
        dq.isEmpty(); 

        // offer and offerLast would be the same
        // Will add at last
        dq.offer(5);
        // Same as offer, will add at last
        dq.offerLast(13);


        // Will add at first
        dq.offerFirst(12);

        // Similarly
        // peek would return first element of queue
        // peek and peekFirst would be the same
        dq.peek();
        dq.peekFirst();


        dq.peekLast();

        // poll and pollFirst would be the same
        // poll would remove first element of queue
        dq.poll();
        dq.pollFirst();

    
        dq.pollLast();
    }
}
