class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,6,1,4};
        int element;

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length -i -1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        element = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                element++;
            }
        }
        System.out.print(element);
    }
}