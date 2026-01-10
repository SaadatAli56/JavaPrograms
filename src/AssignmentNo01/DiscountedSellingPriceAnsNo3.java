package AssignmentNo01;
import java.sql.SQLOutput;
import java.util.Scanner;
public class DiscountedSellingPriceAnsNo3 {
    public static void main() {
        Double OriginalPrice , DiscountedPer , DiscountedAmount , DiscountedSellingPrice ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Original Price : ");
        OriginalPrice = sc.nextDouble();

        System.out.print("Enter Discounted Percentage : ");
        DiscountedPer = sc.nextDouble();

        //per = (DA/OP) * 100
        DiscountedAmount =(DiscountedPer * OriginalPrice) / 100 ;

        // DSP = OP - DA;
        DiscountedSellingPrice = OriginalPrice - DiscountedAmount;
        System.out.println("The Discounted Selling Price is :"+DiscountedSellingPrice);

        //System.out.println("Discounted Amount is : "+DiscountedAmount);
    }
}
