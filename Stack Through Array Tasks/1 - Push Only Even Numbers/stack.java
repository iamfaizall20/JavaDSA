class StackDSA {
    static int[] stackArray;
    static int top = -1;

    public StackDSA(int stackSize) {
        stackArray = new int[stackSize];
    }
    //Pushes Only if Value is Even
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
    public void displayStack(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }else{
            for (int i=top;i>=0;i--){
                System.out.print(stackArray[i] +" ");
            }
        }
    }
}
public class stack {
    public static void main(String[] args) {
    StackDSA s = new StackDSA(5); //Passed Stack Size in Constructor

    s.pushIfEven(10);
    s.pushIfEven(12);
    s.pushIfEven(15); //15 will not be pushed into stack
    s.pushIfEven(14);
    s.pushIfEven(16);

    s.displayStack();
    
    }
}
