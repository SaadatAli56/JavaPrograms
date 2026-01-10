package AssignmentNo01;
import java.util.Scanner ;

public class WattsCalculation05 {
    public static void main(){
        int watt , amp , volt ;
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Volts : ");
        volt = sc.nextInt();

        System.out.print("Enter Ampares : ");
        amp = sc.nextInt();

        watt = amp * volt ;
        System.out.println("Watts is : "+watt);
    }
}
