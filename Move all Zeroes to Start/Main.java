//Problem: Move all zeros to Start of the array
public class Main {
    static void ZerosToStart(int[] arr){
        int j = arr.length-1;
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
             }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,2,0,3,0};

        ZerosToStart(arr);

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
/*
Test Cases

Test Case 1:
Input:  {0, 1, 0, 3, 12}
Expected Output: 0 0 1 3 12

Test Case 2:
Input:  {0, 0, 1, 0, 2, 3, 0}
Expected Output: 0 0 0 0 1 2 3

Test Case 3:
Input:  {1, 2, 3, 4, 5}
Expected Output: 1 2 3 4 5

 */