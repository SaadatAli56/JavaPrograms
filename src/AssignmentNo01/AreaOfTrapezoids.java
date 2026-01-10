package AssignmentNo01;
import java.util.Scanner;
public class AreaOfTrapezoids {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double a , b , h , area;

        System.out.print("Enter first line length : ");
        a = sc.nextDouble();
        System.out.print("Enter second line length : ");
        b = sc.nextDouble();
        System.out.print("Enter perpendicular Distance : ");
        h = sc.nextDouble();

        area = h * (a+b) / 2;

        System.out.println("The Area of Trapezoid is : "+area);
    }
}
