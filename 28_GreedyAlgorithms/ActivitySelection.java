import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        // int start[] = {1,3,0,5,8,5};
        // int end[] = {2,4,6,7,9,9}; //sorted based on end time

        // int start[] = {0,1,3,5,5,8};//sorted based on start time
        // int end[] = {6,2,4,7,9,9};

        int start[] = {1,3,2,5};
        int end[] = {2,4,3,6};

        //sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function -> sortform
        // this means array should be sorted based on column 2
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //-----------------code is if activities are sorted based on end time----------------------
        // //1st activity
        // maxAct = 1;
        // ans.add(0);
        // int lastEnd = end[0];

        // for(int i=1; i<end.length; i++) {
        //     if(start[i]>=lastEnd) {
        //         //activity selection
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }

        // System.out.println(maxAct);
        // for(int i=0; i<ans.size(); i++) {
        //     System.out.print(" A" + ans.get(i));
        // }
        // System.out.println();

        //------------------is activities are sorted based on start or in jumbled way
        //1st activity
        maxAct = 1;
        ans.add(activities[0][0]); //add Index of activity
        int lastEnd = activities[0][2]; 

        for(int i=1; i<activities.length; i++) {
            if(activities[i][1]>=lastEnd) {
                //activity selection
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println(maxAct);
        for(int i=0; i<ans.size(); i++) {
            System.out.print(" A" + ans.get(i));
        }
        System.out.println();

    }    
}
