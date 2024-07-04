public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 4, 7, 12, 8, 9, 4};
        SelectionSortDemo(arr);
    }

    private static void SelectionSortDemo(int[] arr) {
        int indexOfSmallest,temp;
        for(int i=0;i< arr.length;i++){
            indexOfSmallest=i;
            for(int j=i;j<arr.length;j++){
                if(arr[indexOfSmallest]>arr[j]){
                    indexOfSmallest=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[indexOfSmallest];
            arr[indexOfSmallest]=arr[i];

        }
    }
}
