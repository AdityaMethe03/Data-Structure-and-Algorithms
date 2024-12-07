
public class FindPermutation {
    public static void permutation(String str, String ans) {
        //base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        //recursion - O(n * n!)
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i+1);
            permutation(NewStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }    
}
