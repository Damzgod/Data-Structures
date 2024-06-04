public class Stack {
    int size;
    int top;
    int[] array;

    Stack (int capacity){
        top = -1;
        size = capacity;
        array = new int[size];

    }

    boolean Isfull(){
        return (top == size-1);
    }

    boolean Isempty(){
        return (top == -1);
    }

    void push (int item){
        if (Isfull()){
            System.out.println("Stack Overflow!!");
        }else{
            array[top + 1] = item;
            top++;
        }
    }

    void pop(int item){
        if (Isempty()){
            System.out.println("Empty Stack!!");
        }else{
            array[top - 1] = item;
            top--;
        }
    }

    void Stackoutput() {
        if(Isempty()){
            System.out.println("Empty Stack");
        }else{
            System.out.println("Stack Items: ");
            for (int = 0; i <= top; i++){
                System.out.println(array[i] + " ");
            }
            System.out.println();
        }
    }

}
