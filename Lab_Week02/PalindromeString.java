package Lab_Week02;
import java.util.Scanner;

public class PalindromeString {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string : ");
         String str = sc.nextLine();

        String reverse ="";
        for(int i = str.length() - 1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("It is a Pallindrome String");
        }
        else {
            System.out.println("It is not a Pallindrome String");
        }
        sc.close();

    }
}
