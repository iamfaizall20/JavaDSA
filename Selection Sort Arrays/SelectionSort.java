public class SelectionSort {
    static void printArray(int[] arr){
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,8,2,4};

        for(int i=0;i< arr.length-1;i++){
                int smallest = i;
            for(int j=i+1;j< arr.length;j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
        }
        printArray(arr);
    }
}