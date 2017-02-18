/**
 * @author Riko Hamblin
 *
 * Disclaimer: I don't own or make claims of creating this algorithm. This was
 * used as a personal exercise in order to test my knowledge of the algorithm
 * being exhibited. For educational purposes only.
 *
 * O(n^2) Time Complexity
 */
public class BubbleSort {
    //attributes
    static public final int ASCENDING = 0;
    static public final int DECENDING = 1;
    private int[] arr;
    
    BubbleSort(int[] arr){
        this.arr = arr.clone(); //this ensures a new object is created thus ensure class stays immutable
    }
    
    /**
    * Effects: Sort array using bubble sort. If order == ASCENDING it returns the array
    *           in ascending order. If order == DESCENDING it sorts the array in descending order. Else it throws
    *           an IllegalArgumentException.
    */
    public void sort(int order){
       
        if(order!= ASCENDING && order!= DECENDING) throw new IllegalArgumentException("BubbleSort.sort() : Not a valid argument");
        
        int n = arr.length;
        for(int i = n-1; i>=1;i--)
            for(int j=0; j<= i-1; j++)
                switch(order){
                    case ASCENDING:
                        if(arr[j]>arr[j+1]){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                        break;

                    case DECENDING:
                        if(arr[j]<arr[j+1]){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                        break;
                        }
    
        
        
    }
    public void print(){
      for(int i: this.arr)
        System.out.print(i+ " ");
      
      System.out.println();
    }
    
    public static void main(String[] args){
       int[] n = {3,6,1,78,4};
       BubbleSort b = new BubbleSort(n);
       b.print();
       b.sort(BubbleSort.ASCENDING);
       b.print();
       b.sort(BubbleSort.DECENDING);
       b.print();
       b.sort(6); //throws exception
       
    }
}
