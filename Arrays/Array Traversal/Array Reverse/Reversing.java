//Performing Reversing Operation
public class Reversing {
    public static void main(String[] args) {

    int[] myArray = {1,2,3,4,5,6,7,8} ;
    int arrSize = myArray.length;

    //Printing Array before Reversing
    System.out.print("Array: ");
    for(int i:myArray){
        System.out.print(i+" ");
    }

    //Loop for Reversing
    for(int i=0;i<arrSize/2;i++){
        int  temp = myArray[i];
            myArray[i] = myArray[arrSize- i-1];
            myArray[arrSize-i-1] = temp;
        }

    //Printing Array before Reversing
    System.out.print("\nArray After Reversing: ");
    for(int i:myArray){
        System.out.print(i+" ");
         }
    }
}