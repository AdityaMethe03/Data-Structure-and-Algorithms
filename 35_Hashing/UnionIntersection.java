import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        LinkedHashSet<Integer> union = new LinkedHashSet<>(); //to print in insertion order not in sorted
        ArrayList<Integer> res = new ArrayList<>();
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(); //to print in insertion order not in sorted


        for(int i=0; i<arr1.length; i++) {
            union.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            if(union.contains(arr2[i])) {
                intersection.add(arr2[i]);
            }
            union.add(arr2[i]);
        }

        System.out.println(union);
        System.out.println(intersection);

        for(int a : intersection) {
            res.add(a);
        }

        for(int i=0; i<res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
}
