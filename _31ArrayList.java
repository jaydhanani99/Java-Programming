import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class _31ArrayList {
    public static void main(String[] args) {
        // ArrayList implements the List so you can also write as follow
        // List<Integer> values = new ArrayList<Integer>();
        ArrayList<Integer> values = new ArrayList<Integer>();

        Vector<Integer> v = new Vector<Integer>();
        // The main difference between ArrayList and Vector
        // 1) If size of  list exceeded, arraylist increase it by 50% where as  Vector increases it by 100%.
        // 2) Multiple thread can access ArrayList at the same time, where as only 1 thread can access Vector.

        
        for (int i = 0; i < 100; i++){
            values.add(i);
        }

        System.out.println(values);
        System.out.println(values.get(0));
        // To print size
        System.out.println(values.size());
        // To set particular value, if you set out of range, it would throw an exception
        values.set(0, 5000);
        // To remove item, (if you remove from first, it would take time)
        values.remove(0);

        // To iterate
        for (int i = 0; i < values.size() ; i++) {
            System.out.println(values.get(i));
        }

        // To iterate on values
        for (Integer x: values) {
            System.out.println(x);
        }

        // To iterate using iterator
        Iterator<Integer> it = values.iterator();
        while (it.hasNext())
            System.out.println(it.next());

    }
}
