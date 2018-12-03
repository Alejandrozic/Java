class MyStack{

    int[] stack;
    int top;
    int size;

    MyStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = 0;
    }

    void push(int data) {
        if (top >= size)
            return;
        stack[top] = data;
        top += 1;
    }

    void pop() {
        stack[top-1] = 0;
        top -= 1;
    }

    int peek(){
        return stack[top-1];
    }

    void getStack() {
        for (int i : stack){
            System.out.println("Stack " + i);
        }
    }
}