package WEEK01;

public class Lab02TransposeAction {
    public static void main(String[] args) {
        int[][] orig= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Tramspose of Matix is : ");
        int[][] tran = new int[3][3];
        for(int i = 0; i<3 ; i++){
            for(int j = 0; j< 3; j++){
                tran[i][j] = orig[j][i];
                System.out.print(tran[i][j]);
            }
            System.out.println();
        }

    }
}
