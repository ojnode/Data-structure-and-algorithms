import java.util.ArrayList;
import java.util.Arrays;

public class searchingSorting {

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
        ArrayList<Integer> sorted = new ArrayList<>();
        int originalSize = arr.size();
        
        for (int i = 0; i < originalSize; i++) {
            int min = arr.get(0);
            int indexOfmin = 0;
            for (int j = 1; j < arr.size(); j++) {
                if (min > arr.get(j)) {
                    min = arr.get(j);
                    indexOfmin = j;
                } 
            }
            arr.remove(indexOfmin);
            sorted.add(min);
        }
        return sorted;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
        ArrayList<Integer> sorted = new ArrayList<>();
        int innerSize;
        sorted.add(arr.get(0));
        for (int i = 1; i < arr.size(); i++) {
            innerSize = sorted.size() - 1;
            for (int j = 0; j < sorted.size(); j++) {
                if (arr.get(i) < sorted.get(j)) {
                    sorted.add(j, arr.get(i));
                    break;
                } 
                if (j == innerSize) {
                    sorted.add(arr.get(i));
                }
            }
        }
        return sorted;
    }

    public static String bubbleSort(int[] arr) {
        boolean swap = true;
        int adjecentElement;
        int nextIndex;
        while (swap) {
            swap = false;
            for (int i = 0; i < (arr.length - 1); i++) {
                nextIndex = i + 1;
                if (arr[i] > arr[nextIndex]) {
                    adjecentElement = arr[nextIndex];
                    arr[nextIndex] = arr[i];
                    arr[i] = adjecentElement;
                    swap = true;
                }
            }
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        // ArrayList<Integer> unsorted= new ArrayList<>(Arrays.asList(9, 5, 8, 1, 4,10));
        // System.out.println(selectionSort(unsorted));
        // System.out.println(insertionSort(unsorted));
        int[] unsorted = {5, 1, 7, 3, 8 ,9 , 1, 10, 0};
        System.out.println(bubbleSort(unsorted));
    }
}
