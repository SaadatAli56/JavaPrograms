package AssignmentNo01;
import java.util.Scanner;
public class OriginalPriceCalculation4 {

    public static void main(){

        Scanner sc = new Scanner (System.in);

        double OrgP , DisP, DisPer ;

        System.out.print("Enter Discounted Price : ");
        DisP = sc.nextDouble();

        System.out.print("Enter Distounted Percentage : ");
        DisPer = sc.nextDouble();

        //percentage formula : per = (disp / orgp ) *100
        //orgp = (disp / per ) * 100
        OrgP = (DisP / DisPer) * 100;

        System.out.println("Original Price is : "+OrgP);


    }
}
