package WEEK01;

public class FindLargestNoInArray {
    public static void main(String[] args){
        int[] values = {34,71,13,80,45,23};
        int largest = values[0];
        int a = values.length;
        for(int i = 0 ; i < a ; i++ ){
            if(largest < values[i]){
                largest = values[i];
            }
        }
        System.out.println("The Largest Values in array is " + largest);
    }
}
