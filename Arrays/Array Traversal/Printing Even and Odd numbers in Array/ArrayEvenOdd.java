public class ArrayEvenOdd {

    static void PrintEvenNumbers(int[] arr){
        System.out.print("Even Numbers in Array: ");
        for(int k:arr){
            if(k%2==0) System.out.print(k+" ");
        }
    }
    static void PrintOddNumbers(int[] arr){
        System.out.print("Odd Numbers in Array: ");
        for(int k:arr){
            if(k%2!=0) System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,25,16,45,2,68,55,86};


        PrintEvenNumbers(arr);
        System.out.println();
        PrintOddNumbers(arr);
    }
}
