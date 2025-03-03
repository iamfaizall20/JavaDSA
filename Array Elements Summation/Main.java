public class Main {
    //Function to Sum all Array ELements
    static void ArraySummation(int[] myArr){
        int sum = 0;
        if(myArr.length == 0) {
            System.out.println("Array is empty");
        }
        else{
            System.out.print("Array: ");
            for (int i : myArr) {
                System.out.print(i + " ");
                sum += i;
            }
        System.out.print("\nArray Sum is: "+sum);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArraySummation(arr);
    }
}