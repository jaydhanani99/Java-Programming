import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _34LinkedHashMap {
    public static void main(String[] args) {
        // LinkedHashMap implements the Map so you can also write as follow
        // Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        // Order of the key would be the same as you have added the items
        LinkedHashMap<Integer, String> l = new LinkedHashMap<Integer, String>();

        // TreeMap implements the Map so you can also write as follow
        // Map<Integer, String> map = new TreeMap<Integer, String>();
        // Order of the key would be in sorted order
        TreeMap<Integer, String> t = new TreeMap<Integer, String>();         

        sortedMaps(l);
        sortedMaps(t);
    }

    // HashMap, LinkedHashMap and TreeMap all implements the Map interface
    public static void sortedMaps(Map<Integer, String> map) {
        map.put(4, "Ice Cream");
        map.put(8, "pie");
        map.put(0, "pizza");
        map.put(12, "hamburger");
        map.put(27, "fries");

        for(Integer numbers: map.keySet()) {
            String food = map.get(numbers);
            System.out.println(numbers + ":" + food);
        }
    }
}
