import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);

        System.out.println(set);
        System.out.println("Size: " + set.size());

        set.remove(2);

        if(set.contains(2)) {
            System.out.println("set contains 2");
        } else {
            System.out.println("2 has been removed");

        }

        if(set.contains(3)) {
            System.out.println("set contains 3");
        }

        set.clear();
        System.out.println(set.isEmpty());

        //---------------------Iteration on HashSet-----------------------------------------------------------
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Chennai");

        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for(String city : cities) {
            System.out.println(city);
        }

    }
}
