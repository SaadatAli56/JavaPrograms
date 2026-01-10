package AssignmentNo01;
import java.util.Scanner;

public class EvenOdd07 {
 public static void main(){
     Scanner sc = new Scanner(System.in);
     int numb , remainder ;
     System.out.print("Enter a Number : ");
     numb = sc.nextInt();

     remainder = numb%2 ;
     if( remainder == 0 ){
         System.out.println("Number is EVEN");
     }
     else {
         System.out.println("Number is ODD");
     }

 }
}
