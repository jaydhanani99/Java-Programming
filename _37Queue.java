import java.util.LinkedList;
import java.util.Queue;

public class _37Queue {
    public static void main(String[] args) {

        // LinkedList implements Queue so that we can define as Queue and  use LinkedList to implement queue
        Queue<Integer> qu = new LinkedList<>();

        // To add element
        qu.offer(3);
        
        // If error while adding element using add(), it would throw an exception where as offer does not
        qu.add(5);

        // To remove element from  queue
        qu.poll();
        // If error while removing element using remove(), it would throw an exception where as poll does not, it return null
        qu.remove();
        // To check the element to be removed
        qu.peek();

        

    }
}
