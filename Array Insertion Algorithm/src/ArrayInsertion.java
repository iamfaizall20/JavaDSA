//Array Insertion Operation
import java.util.Scanner;
public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        int size,location,element;

        System.out.print("Enter Size of Array: ");
        size = getInput.nextInt();

        int[] myArray = new int[size + 1];

        System.out.print("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            myArray[i] = getInput.nextInt();
        }

        System.out.print("Enter Location to Insert Element: ");
        location = getInput.nextInt();

        System.out.print("Enter Element to Insert: ");
        element = getInput.nextInt();

        for(int i = size;i>location;i--){
            myArray[i] = myArray[ i - 1];
        }
        myArray[location] = element;
        size++;

        System.out.print("Array After Insertion: ");
        for(int i:myArray){
            System.out.print(i+" ");
        }
    }
}
