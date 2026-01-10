package AssignmentNo01;
import java.util.Scanner;
public class AreaAndCircumferenceOfCircle {
    public static void main(){

        Scanner sc = new Scanner(System.in);

        double circumference , area , radius , pi;
        pi = 3.1415;

        System.out.print("Enter Radius of Circle : ");
        radius = sc.nextDouble();

        area = pi * radius * radius ;
        circumference = 2 * pi * radius;
        //System.out.println("The Area of Circle is : "+area);

        System.out.print("The Area of Circle is : ");
        System.out.println(area);

        System.out.println("The Circumference of Circle is : "+circumference);
       /* System.out.print("The Circumference of Circle is : ");
        System.out.println(circumference)*/;
    }
}
