/*
 * @author avade_000
 */
public class BubbleSort {
    
    static public final int ASCENDING = 0;
    static public final int DECENDING = 1;
    private int[] arr;
    
    BubbleSort(int[] arr){
        this.arr = arr.clone();
      
    }
    
    public void sort(int order){
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
       
       
    }
}
