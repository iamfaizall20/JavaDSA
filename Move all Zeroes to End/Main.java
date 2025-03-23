//Problem: Move all zeros to end of the array
public class Main {
    static void ZerosToEnd(int[] arr){
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
             }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        ZerosToEnd(arr);

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
