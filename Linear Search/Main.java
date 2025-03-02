public class Main {
    public static int LinearSearch(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {22,45,88,12,46,8};
        int element = 87;
        int index = LinearSearch(arr , element);

        if(index!= -1){
        System.out.println("Element found at Index: "+index);
        }else{
            System.out.println("Element Not Found");
        }
    }
}