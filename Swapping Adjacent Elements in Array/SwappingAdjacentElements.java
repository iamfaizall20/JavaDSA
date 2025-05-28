/** 
 Solved a Problem "Swapping Alternative Adjacent Elements of Array"
 means elements on indexes 0,1 will be swapped then elements on 
 indexes 2,3 will be swapped.
*/

public class SwappingAdjacentElements {

    //Printing Array
    static void PrintArray(int[] arr){
        for(int k:arr) System.out.print(k+" ");
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        for(int i=0;i< arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        PrintArray(arr);
    }
}
