import java.util.ArrayList;
import java.util.Arrays;

public class selectionSort {

    public static ArrayList<Integer> sortArray(ArrayList<Integer> arr) {
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

    public static void main(String[] args) {
        ArrayList<Integer> unsorted= new ArrayList<>(Arrays.asList(5, 4, 1, 3, 9, 13, 20, 0, 7));
        System.out.println(sortArray(unsorted));
    }
}
