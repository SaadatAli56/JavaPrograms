package Lab_week_03;

public class SimpleReverse {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int n = arr.length;

            System.out.print("Before: 123456");

            // Sirf ek loop jo aakhir (n-1) se shuru ho raha hai
            System.out.print("\nAfter: ");
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        }
}
