public class Traversal {

    //Printing Array
    static void ArrayTraverse(int[] arr){
        System.out.print("Array: ");
        for(int k:arr) {
            System.out.print(k+" ");
        }
        System.out.println();
    }

    //Printing Array in Reverse Order
    static void ReverseArrayTraverse(int[] arr){
        System.out.print("Reversed Array: ");
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    //Finding Maximum element in Array
    static void MaxElement(int[] arr){
        int max = arr[0];
        for(int k:arr){
            if(k>max){
                max = k;
            }
        }
        System.out.println("\nMaximum Element: "+max);
    }

    //Finding Minimum element in Array
    static void MinElement(int[] arr){
        int min = arr[0];
        for(int k:arr){
            if(k<min){
                min = k;
            }
        }
        System.out.print("Minimum Element: "+min);
    }

    public static void main(String[] args) {
        int[] arr = {12,25,36,14,45,69,78,66};

    ArrayTraverse(arr);
    ReverseArrayTraverse(arr);
    MaxElement(arr);
    MinElement(arr);
    }
}