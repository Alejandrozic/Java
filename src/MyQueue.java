class MyQueue{

    int[] queue;
    int size;
    int head;
    int tail;

    MyQueue(int size){
        this.size = size;
        this.head = 0;
        this.tail = 0;
        queue = new int[size];
    }

    void enqueue(int data){
        queue[tail] = data;
        tail = (tail + 1) % size;
    }

    void dequeue(){
        queue[head] = 0;
        head = (head +1 ) % size;
    }

    int peek(){ return queue[head]; }

    void getQueue(){
        for (int n : queue)
            System.out.println("Queue " + n);
    }
}