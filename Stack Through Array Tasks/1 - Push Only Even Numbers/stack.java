import java.util.Scanner;

class StackDSA {
    static int[] stackArray;
    static int top = -1;

    public StackDSA(int stackSize) {
        stackArray = new int[stackSize];
    }

    public void pushIntoStack(int value){
        if(top < stackArray.length - 1){
            top++;
            stackArray[top] = value;
        }else{
            System.out.println("Stack Overflow");
        }
    }
    public void pushIfGreaterThanTop(int value){
        if(value > stackArray[top]){
            if(top < stackArray.length - 1){
                top++;
                stackArray[top] = value;
            }else{
                System.out.println("Stack Overflow");
            }
        }
    }
    public int popFromStack(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }

        int TopValue = stackArray[top];
        top--;
        return TopValue;
    }
    public void peek2OfStack(){
        if(top != -1){
            int PeekValue = stackArray[top - 1];
            System.out.printf("Peek Value - %d",PeekValue);
        }
    }
    public void displayStack(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }else{
            for (int i=top;i>=0;i--){
                System.out.print(stackArray[i] +" ");
            }
        }
    }
    public void pushIfEven(int value){
        if(value % 2 == 0){
            if(top < stackArray.length - 1){
                top++;
                stackArray[top] = value;
            }else{
                System.out.println("Stack Overflow");
            }
        }
    }
    public int frequencyOfElement(int element){
        int count = 0;
        if(top == -1){
            System.out.println("Stack UnderFlow");
        }else{
            for(int i=0;i<stackArray.length;i++){
                if(stackArray[i] == element){
                    count++;
                }
            }
        }
        return count;
    }
}
public class stack {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

//        System.out.println("Enter size of Stack ");
//        int stackSize = getInput.nextInt();

        StackDSA s = new StackDSA(5);

        s.pushIntoStack(8);
        s.pushIntoStack(10);
        s.pushIntoStack(8);
        s.pushIntoStack(7);
        s.pushIntoStack(8);

        s.peek2OfStack();
//        int PoppedValue = s.popFromStack();
//
//        while (PoppedValue % 2 != 0){
//            System.out.println(PoppedValue);
//            PoppedValue = s.popFromStack();
//        }
//
//        System.out.print("Frequency of element: ");
//        System.out.println(s.frequencyOfElement(6));
    }
}
