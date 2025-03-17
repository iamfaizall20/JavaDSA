public class InsertionSort {
    static void printArray(int[] arr){
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,8,2,4};

        for(int i=1;i< arr.length;i++){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        printArray(arr);
    }
}
