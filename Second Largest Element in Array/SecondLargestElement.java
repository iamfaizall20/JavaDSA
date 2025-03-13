//Second Largest Element in Array
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12,25,75,15,95};
        int largest = arr[0], secondlargest = largest;

        for(int i:arr){
            if(i>largest) {
                secondlargest = largest;
                largest = i;
            }else if(i > secondlargest && i<largest){
                secondlargest =i;
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+secondlargest);
    }
}
