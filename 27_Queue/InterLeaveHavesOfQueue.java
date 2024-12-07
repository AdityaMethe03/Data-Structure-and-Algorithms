
import java.util.*;

public class InterLeaveHavesOfQueue {
    public static void interleave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new java.util.LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++) { //do not write q.size() here directly cause queue's size is changing as we are removing from queue
            firstHalf.add(q.remove());
        }

        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);

        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
