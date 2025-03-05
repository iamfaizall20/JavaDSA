public class Main {
    //Linear Search
    static void LinearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element " + element + " found at index: " + i);
                break;
            }
        }
    }

    //Binary Search
    static void BinarySearch(int[] arr, int element) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (element == arr[mid]) {
                System.out.println("Element " + element + " found at index: " + mid);
                break;
            } else if (element < arr[mid]) {
                end = mid - 1;
            } else if (element > arr[mid]) {
                start = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        //sorted array for both searching algorithm
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 1; // target element

        LinearSearch(arr , element);
        BinarySearch(arr, element);
    }
}
