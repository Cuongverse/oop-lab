package Lab01;

public class MatricesSum {
    public static void main(String[] args) {
        int[][] matrix1 = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                        };

        int[][] matrix2 = {
                            {2,3,4},
                            {5,6,7},
                            {8,9,10}
                        };
        
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++){
            for (int j : sum[i]){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
