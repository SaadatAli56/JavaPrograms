package Lab_Week_04;

public class Lab_01_MatrixAddition_Function {
   public static void main(String[] args) {
        //int[][] matA = {{1,2,3},{2,5,3},{5,6,3}};
        //int[][] matB = {{4,3,2},{3,4,5},{2,3,3}};
       System.out.println("Sum of Matrics are : ");
        SumMatrix();
    }
    public static void SumMatrix() {
        int[][] matA = {{1,3,4},{3,3,3},{1,2,6}};
        int[][] matB = {{4,3,2},{3,4,5},{2,3,3}};
        int[][] sumMat = new int[3][3];
       for(int i = 0 ; i < 3 ; i++){
           for(int j = 0; j < 3 ; j++){
               sumMat[i][j] = matA[i][j]+matB[i][j];
               System.out.print(sumMat[i][j]);
           }
           System.out.println();
       }
    }
}
