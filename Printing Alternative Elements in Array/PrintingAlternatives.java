public class PrintingAlternatives {

    //Printing Alternative elements in Array
    static void Alternatives(int[] arr){
        System.out.print("Alternative Elements: ");
        for(int k=0;k< arr.length;k++){
            if(k%2==0){
            System.out.print(arr[k]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,25,69,45,78,13,36,86,94};

        Alternatives(arr);
    }
}
