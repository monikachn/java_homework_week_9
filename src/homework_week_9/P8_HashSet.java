package homework_week_9;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class P8_HashSet {
    public static void main(String[] args) {
        HashSet<Integer>set= new HashSet<>();
           set.add(2);
           set.add(4);
           set.add(7);
           set.add(8);
           set.add(11);
        System.out.println(set);
        for(Integer n : set){
            if(n >= 1 && n <= 10){
                System.out.println(n + " number is between 1 and 10 are in the set");
            }
        }

    }

}
