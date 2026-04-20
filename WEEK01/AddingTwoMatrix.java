package WEEK01;

public class AddingTwoMatrix {
    public static void main(String[] args){
        int[][] matA = {{1,2,3},{4,5,6},{2,5,3}};
        int[][] matB = {{4,5,2},{1,3,2},{1,3,6}};
        int[][] rMatC = new int[3][3];
        System.out.println("Resultant Matrix C is : ");
        for(int i =0; i<3 ; i++) {
            for (int j = 0; j < 3; j++) {
                rMatC[i][j] = matA[i][j] + matB[i][j];

                System.out.print(rMatC[i][j]);
            }
            System.out.println();
        }
    }
}
