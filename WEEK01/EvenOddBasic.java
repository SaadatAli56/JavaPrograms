package WEEK01;

public class EvenOddBasic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        int evenCount = 0;
        int oddCount = 0;
        int a = numbers.length;

        System.out.print("Even Numbers: ");
        for (int i = 0; i < a; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                evenCount = evenCount + 1;
            }
        }

        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < a; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
                oddCount = oddCount + 1;
            }
        }
        System.out.println("\n\nEven Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
    }
}

