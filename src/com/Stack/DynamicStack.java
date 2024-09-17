package com.Stack;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    public boolean push(int item){
        if(this.isFull()){
            //Double the array size
            int[] temp = new int[data.length*2];

            //copy all the prev items in new data[]
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        //at this point we know arr is not full
        //insert item normally
        return super.push(item);
    }

    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
