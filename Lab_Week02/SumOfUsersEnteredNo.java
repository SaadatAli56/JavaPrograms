
package Lab_Week02;
import java.util.Scanner;
 public class SumOfUsersEnteredNo {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int  sum = 0, n;
        System.out.println("Enter the numbers : ");
        for(int i = 1; i <= 5; i++){
            n = sc.nextInt();
            sum = sum + n;

        }
        System.out.print("total sum is = "+sum);

    }
}