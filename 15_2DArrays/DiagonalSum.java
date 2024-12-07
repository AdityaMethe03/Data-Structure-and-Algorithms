
public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        //TIME COMPLEXITY: O(n^2)
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[0].length; j++){
//                if(i == j){
//                     sum += matrix[i][j];
//                }
//                else if(i+j == matrix.length-1){
//                    sum += matrix[i][j];
//                }
//                //bcoz of ELSE IF [&& i!=j] condi not requi.
//            }
//        }

        //TIME COMPLEXITY: O(n)
        for(int i=0; i<matrix.length; i++){
            //pd
            sum+= matrix[i][i];
            //sd
            if(i != matrix.length-1-i){
                sum+= matrix[i][matrix.length-1-i];
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix1[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}};

        int matrix2[][] = {{0,1,2},{3,4,5},{6,7,8}};

        System.out.println(diagonalSum(matrix1));
        System.out.println(diagonalSum(matrix2));

    }
}
