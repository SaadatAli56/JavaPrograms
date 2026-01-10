package AssignmentNo01;
import java.util.Scanner ;
public class AreaofTriangle {
   public static void main() {
       Scanner sc = new Scanner(System.in);
        double a,b,c,s,a1 , a2 ,a3, a4,area;
         System.out.print("Enter side 01 ; ");
         a = sc.nextDouble();

       System.out.print("Enter side 02 ; ");
       b = sc.nextDouble();

       System.out.print("Enter side 03 ; ");
       c = sc.nextDouble();

       s= (a + b + c) / 2 ;
       a1 = s-a;
       a2 = s-b ;
       a3 = s-c ;
       a4 =s * a1 * a2 * a3;
       area = Math.sqrt(a4);

       System.out.println("The Area of a Triangle is : "+area);

    }

}
