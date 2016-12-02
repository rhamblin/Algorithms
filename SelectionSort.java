
/**
 * @author Riko Hamblin
 *
 * Disclaimer: I don't own or make claims of creating this algorithm. This was
 * used as a personal exercise in order to test my knowledge of the algorithm
 * being exhibited. For educational purposes only.
 *
 * O(n^2) complexity
 */
public class SelectionSort {

    static public final int ASCENDING = 0;
    static public final int DECENDING = 1;
    /**
     * Effects: This method sorts an array of integers in ascending order using selection sort technique
     *
     * @param arr
     */
    static public void selectionSort(int[] arr) {

        /*
         *This technique has two iterators. The first one sits at a position in the array. The second iterator then
         * traverses through the remaining of the array to find the index of a smaller number if it exist. 
         * After the location of the smallest index is determined it proceeds to swap the two elements before it moves the
         * first iterator one spot forward and repeats the process.
         */
        int i;  //first iterator
        int j; //second iterator
        int smallestIndex = 0; //location of the smallest number in sub-array.
        int temp; // used to swap values around

        for (i = 0; i < arr.length - 1; i++) { //the last element doesnt need to be visited. At that point the array would be sorted

            smallestIndex = i; //assume your starting position is the smallest index

            for (j = i + 1; j < arr.length; j++) //for the rest of the sub array determine the smallest index
            {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            if (smallestIndex != i) { //swap only if index changed
                temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
            }
        }

    }

    /**
     * Effects: This method sorts an array of integers in the order specified using selection sort technique
     *
     * @param arr
     * @param selection
     */
    static public void selectionSort(int[] arr, int selection) {
        
        if(selection == SelectionSort.ASCENDING) {
            SelectionSort.selectionSort(arr);
            return;
        }
        
        int j, biggestIndex = 0,temp; 

        for (int i = 0; i < arr.length - 1; i++) { //the last element doesnt need to be visited. At that point the array would be sorted

            biggestIndex = i; //assume your starting position is the smallest index

            for (j = i + 1; j < arr.length; j++) //for the rest of the sub array determine the smallest index
            {
                if (arr[j] > arr[biggestIndex]) {
                    biggestIndex = j;
                }
            }

            if (biggestIndex != i) { //swap only if index changed
                temp = arr[i];
                arr[i] = arr[biggestIndex];
                arr[biggestIndex] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 5, 1};

        SelectionSort.selectionSort(arr,SelectionSort.DECENDING);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        SelectionSort.selectionSort(arr,SelectionSort.ASCENDING);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
