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

    public static void main() {
        // System.out.println(sumOfnNumbers(12));
        displayNumbers(3, 10);
    }
}