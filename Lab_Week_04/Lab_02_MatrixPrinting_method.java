package Lab_Week_04;

public class Lab_02_MatrixPrinting_method {
    public static void main(String[] args){
        System.out.println("Matrix is ");
                printMatrix();
    }
    public static void printMatrix(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,5,4}};

        for(int i= 0; i<3 ; i++){
            for(int j = 0; j<3; j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
