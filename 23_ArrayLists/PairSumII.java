import java.util.ArrayList;

public class PairSumII {

    public static boolean pairSum2(ArrayList<Integer> list, int target){

        int n = list.size();
        int pivot = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                pivot = i;
                break;
            }
        }

        int lp = pivot+1;
        int rp = pivot;

        while(lp!=rp){
            if((list.get(lp)+list.get(rp)) == target){
                return true;
            } 
            
            if((list.get(lp)+list.get(rp)) < target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println(pairSum2(list, 16));
    }
}
