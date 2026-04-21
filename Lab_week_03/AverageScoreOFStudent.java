package Lab_week_03;

public class AverageScoreOFStudent {
    public static void main(String[] args){
        int[] score = {51,67,78,67,56,78,98,87,45};
        double sum = 0;
       double average;
        int a = score.length;
        for(int i = 0; i<a; i++){
            sum = sum + score[i];
        }
        average = sum / a ;
        System.out.println(a);
        System.out.println("Average Score Of Students is : " + average);
    }
}
