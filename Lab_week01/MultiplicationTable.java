package Lab_week01;
import java.util.Scanner;
public class MultiplicationTable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n , a ;
        System.out.print("Enter any integer no : ");
        n = sc.nextInt();

        for(int i = 1 ; i<=10 ; i++ ){
            a = n * i;
            System.out.println(n +" * "+ i + " = "+ a );
        }
    }
}
