public class SmallestAndLargest {
    public static void SmallestAndLargest(int[] arr) {
        int largest = arr[0], smallest = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else
                if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest: " + smallest +"\nLargest: " + largest);
    }
    public static void main(String[] args) {
        int[] arr = {22,45,73,54,65,84};

        SmallestAndLargest(arr);
    }
}


