public class Main {
    //Average value of Array Elements
    static void AverageofArrayElements(int[] arr){
        int average,sum = 0;
        System.out.print("Array: ");
        for(int i:arr){
            System.out.print(i+" "); //printing array elements
            sum+=i;
        }
        average = sum / arr.length;
        System.out.print("\nAverage of Array Elements: "+average);
    }
    public static void main(String[] args) {
        int[] arr = {25,25,25,25};

        AverageofArrayElements(arr);
    }
}