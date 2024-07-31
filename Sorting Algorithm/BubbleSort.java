import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr= {1, 5, 2, 3, 4, 7,12,8,9,4};
        BubbleSortDemo(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSortDemo(int[] arr){

        boolean swap;
        for(int i=0;i<arr.length-1;i++){
            swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap) return;
        }

    }
}
