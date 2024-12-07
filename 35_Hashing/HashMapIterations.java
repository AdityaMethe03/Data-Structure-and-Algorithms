import java.util.*;

public class HashMapIterations {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 150);
        hm.put("China", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 2);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k: keys) {
            System.out.println("Key = " + k + ",Value= "+hm.get(k));
        }
    }
}
