import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 4, 7, 12, 8, 9, 4};
        InsertionSortDemo(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void InsertionSortDemo(int[] arr) {
        for(int i=0;i< arr.length;i++){
            for(int k=i;k>0 && arr[k-1]>arr[k];k--){
                int temp=arr[k];
                arr[k]=arr[k-1];
                arr[k-1]=temp;
            }
        }
    }
}
