//Performing Printing Operation\

public class Printing {
    public static void main(String[] args) {

        //Declaring and Initializing Array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Traversing all Elements and Performing Printing Operation
        System.out.print("Printing all Elements: ");

        /* Printing Array through For Each Loop */
        for (int i:myArray) {
            System.out.print(i + " ");
        }
    }
}