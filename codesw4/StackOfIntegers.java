public class StackOfIntegers {
    private int elements[];
    private int size;

    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
        this.size = 0;
    }

    public boolean empty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int peek(){
        return elements[size];
    }

    public void push(int value){
        elements[size]=value;
        size++;
    }

    public int pop(){
        int last=elements[size-1];
        int newStack[]=new int[size-1];
        for(int i=0;i<size-1;i++){
            newStack[i]=elements[i];
        }
        elements=newStack;
        size--;
        return last;
    }

    public int getSize(){
        return size;
    }

}
