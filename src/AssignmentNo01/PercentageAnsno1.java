package AssignmentNo01;
import java.util.Scanner;
public class PercentageAnsno1 {
    public static void main(){

        Scanner sc = new Scanner(System.in);

        double ObtainMarks , MaxMarks , Percentage ;

        System.out.print("Enter Obtain Marks = ");
        ObtainMarks = sc.nextDouble();

        System.out.print("Enter Maximum Marks = ");
        MaxMarks = sc.nextDouble();

        Percentage = (ObtainMarks/MaxMarks) *100;
       // System.out.println("The percentage is = "+Percentage);
        System.out.print("The Percentage is : ");
        System.out.println(Percentage);

    }
}
