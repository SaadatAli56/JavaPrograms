package Lab_week_03;

public class SearchTargetNumber {
    public static void main(String[] args){
        int[] arr = {14, 27, 35, 58, 56};
        int target = 35;
        //int target = 58;
        int a = arr.length;
        int foundIndex = -1; // Shuru mein hum -1 rakhte hain (jis ka matlab hai nahi mila)
        for (int i = 0; i < a; i++) {
            if (arr[i] == target) {
                foundIndex = i; // Agar mil jaye to index save kar lo
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Found at index " + foundIndex);
        } else {
            System.out.println("Not found in the array");
        }
    }
}
