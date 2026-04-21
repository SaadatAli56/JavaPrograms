package Lab_Week_04;
import java.util.Scanner;
public class Lab04_PrimeNumberChecking {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            int n ;
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                // Loop 2 se sqrt(n) tak kafi hota hai efficiency ke liye
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false; // Agar divide hogaya to prime nahi hai
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is not a Prime Number");
            }
        }
}