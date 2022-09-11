import java.util.HashMap;
import java.util.Map;

public class _33HashMap {
    public static void main(String[] args) {
        // HashMap implements the Map so you can also write as follow
        // Map<Integer, String> map = new HashMap<Integer, String>();

        // Integer as key and String as value
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(2, "x");
        map.put(3, "y");

        map.get(10); // Would return null if not exists
        System.out.println(map);

        // To check key present or not
        map.containsKey(10);

        // To check value present or not (much slower)
        map.containsValue("x");

        // To add key, value pair if key does not exists
        map.putIfAbsent(2, "10");

        // To check map is empty or not 
        map.isEmpty();
        // To iterate all the key and values

        // Order of the key is not the same in which you have added
        for(Map.Entry<Integer, String> values: map.entrySet()) {
            int key = values.getKey();
            String value = values.getValue();
        }

        // To iterate only keys
        for(Integer key: map.keySet()) {

        }

        // To iterate only values
        for(String value: map.values()) {

        }
    }
}
