package Lab_Week_04;

public class Lab03_Calculator {

        public int findMax(int a, int b) {
            return (a > b) ? a : b;
        }

        public double findMax(double a, double b) {
            return (a > b) ? a : b;
        }

        // Overloaded for 3 integers
        public int findMax(int a, int b, int c) {
            return findMax(findMax(a, b), c);
        }

        // Overloaded for 3 doubles
        public double findMax(double a, double b, double c) {
            return findMax(findMax(a, b), c);
        }

        public static void main(String[] args) {
            Lab03_Calculator calc = new Lab03_Calculator();

            // Testing the methods
            System.out.println("Max (int, 2): (10 to 20) is " + calc.findMax(10, 20));
            System.out.println("Max (double, 2):(5.5 to 2.2) is " + calc.findMax(5.5, 2.2));
            System.out.println("Max (int, 3): " + calc.findMax(10, 50, 30));
            System.out.println("Max (double, 3): " + calc.findMax(1.1, 9.9, 4.4));
        }
    }

