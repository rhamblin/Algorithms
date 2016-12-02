
/**
 * @author Riko Hamblin
 *
 * Disclaimer: I don't own or make claims of creating this algorithm. This was
 * used as a personal exercise in order to test my knowledge of the algorithm
 * being exhibited. For educational purposes only.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 6, 1};

        SelectionSort.selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Effects: This method sorts an array of integers using selection sort
     * technique
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
}
