import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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

        // To convert array to arrayList
        // Please note that Arrays.asList() method will only work for non-premitive data types, for premitive you have create it manually
        String[] s = new String[10];
        List<String> sAsList = Arrays.asList(s);

        // Convert arrayList to array
        String[] array = new String[sAsList.size()];
        Arrays.setAll(array, sAsList::get);

        // Below code will not work
        // int[] a = new int[10];
        // List<Integer> aAsList = Arrays.asList(a);

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


        // Sort arrayList using custom function, we cannot use this for primitive types, we have to convert it to non primitive type
        Collections.sort(values, new Comparator<Integer>() {
            public int compare(Integer idx1, Integer idx2) {
                return idx1 > idx2 ? 1 : 0;
            }
        });

        // Sort non-premitive datatype using custom function
        Integer s1[] = new Integer[10];
        Arrays.sort(s1, new Comparator<Integer>() {
            public int compare(Integer idx1, Integer idx2) {
                return idx1 > idx2 ? 1 : 0;
            }
        });

    }
}
