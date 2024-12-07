import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("India", 100);
        hm.put("USA", 150);
        hm.put("China", 50);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Japan"));

        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Nepal"));

        //Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());

        //to clear the hashmap
        hm.clear();
        System.out.println(hm.isEmpty());


    }
}
