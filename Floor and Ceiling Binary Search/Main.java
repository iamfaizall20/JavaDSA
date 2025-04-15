public class Main {

    public static void BinarySearch(int[] arr,int element){
        int floor = -1 , ceiling = -1;

        int left = 0 , right = arr.length-1;

        while (left <= right){
            int mid = (left+right) / 2;

            if(arr[mid] == element){
                floor = arr[mid];
                ceiling = arr[mid];
                break;
            }else if(arr[mid] > element){
                ceiling = arr[mid];
                right = mid -1;
            }else{
                floor = arr[mid];
                left = mid +1;
            }
        }
        System.out.println("Floor "+floor+" Ceiling "+ceiling);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10};


        BinarySearch(arr,5);

        System.out.print("Array >> ");
        for(int k:arr){
            System.out.print(k+" ");
        }

    }
}