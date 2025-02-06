import java.util.Arrays;

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

    public static int[] merge(int[] a, int[] b, int[] merged) {
        // int[] merged = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if ( a[i] <  b[j]) {
                merged[k] = a[i];
                i++;
                k++;
            } else {
                merged[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            merged[k] = a[i];
            k++;
            i++;
        }
        
        while (j < b.length) {
            merged[k] = b[j];
            k++;
            j++;
        }
        return merged;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1 ) {
            return arr;
        }

        int arrMid = (arr.length - 1) / 2;
        int[] arr1 = new int[arrMid + 1];
        int[] arr2 = new int[arr.length - (arrMid + 1)];

        for (int i = 0; i <= arrMid; i++) {
           arr1[i] = arr[i];
        }

        for (int j = arrMid + 1; j < arr.length; j++) {
            arr2[j - (arrMid + 1)] = arr[j];
        }
        return merge(mergeSort(arr1), mergeSort(arr2), arr);
    }

    public static void main(String[] args) {
        // System.out.println(sumOfnNumbers(12));
        // displayNumbers(3, 10);
        // System.out.println(fibonacci(6));
        System.out.println(Arrays.toString(mergeSort(new int[]{3, 1, 12, 2, 4, 9, 0, 9, 7, 12})));
    }
}