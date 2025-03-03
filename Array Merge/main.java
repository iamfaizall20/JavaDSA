public class main {
    //Function to merge array
    static void ArrayMerge(int[] MergedArray, int[] myArrayOne , int[] myArrayTwo) {

            for(int i=0;i<MergedArray.length;i++){
                if(i < myArrayOne.length){
                    MergedArray[i] = myArrayOne[i];
                }else {
                    MergedArray[i] = myArrayTwo[i - myArrayOne.length];
                }
            }
        System.out.print("Merged Array: ");
            for (int i:MergedArray) {
                System.out.print(i+" ");
            }
    }
    public static void main(String[] args) {
        int[] myArrayOne = {1,2,3,4,5};
        int[] myArrayTwo = {6,7,8,9,10};
        int[] MergedArray  = new int[myArrayOne.length + myArrayTwo.length];

        ArrayMerge(MergedArray, myArrayOne, myArrayTwo);
    }
}