package homework_week_9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class P9_HashMapObject {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ram", 1);
        map.put("Shyam", 3);
        map.put("Karan", 5);
        map.put("Paul", 7);
        map.put("Mohan", 9);

            Iterator<String> peopleKeyList = map.keySet().iterator();
            while (peopleKeyList.hasNext()) {
                String s = peopleKeyList.next();
                System.out.println(s + " " + map.get(s));
            }
        }
    }


