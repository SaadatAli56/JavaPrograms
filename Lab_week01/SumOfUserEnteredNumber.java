package Lab_week01;
import java.util.Scanner;

public class SumOfUserEnteredNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int sum = 0 , userNo;
        System.out.print("Enter a number : ");
        userNo = sc.nextInt();
        //user give a number and program will do sum from 1 to that user's number
        for(int i = 1; i<=userNo; i++){
            sum = sum + i;
        }
        System.out.println("The Sum from 1 to User Enetered No is : " + sum);
    }
}
