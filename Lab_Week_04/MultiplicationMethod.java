package Lab_Week_04;

public class MultiplicationMethod {
    public static void main() {
        int n = 5;
        multiplication(n);
    }
        public static void multiplication(int x){
            for(int i = 1; i<=10; i++){
               int  result = x * i;
                System.out.println(x + " * " + i + " = " + result);
            }
        }
}


