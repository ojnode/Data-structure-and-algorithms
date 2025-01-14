public class recursion {

    public static int sumOfnNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        else 
        {
            return n + sumOfnNumbers(n-1);
        }
    }

    public static void displayNumbers(int x, int y) {
        int nextInteger = x + 1;
        if (x < y && nextInteger < y) {
            System.out.print(nextInteger + " ");
            displayNumbers(nextInteger, y);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        
    }

    public static void main(String[] args) {
        // System.out.println(sumOfnNumbers(12));
        // displayNumbers(3, 10);
        System.out.println(fibonacci(6));
    }
}