package PriorityQueue;

public class MyPriorityQueueUsingArray {
    int[] queue;
    int front;
    int rear;
    int size;
   public MyPriorityQueueUsingArray(int queueSize){
        queue =new int[queueSize];
        this.front=-1;
        this.rear=-1;
        this.size=0;
    }

//min Priority queue using arrary in java

    public boolean enqueue(int element) {
        boolean response = false;
        //if first element comes then increment front & rear both then insert element
        if (isEmpty()) {
            front = rear = 0;
            queue[rear] = element;
        }

        else if (rear != queue.length) {

            rear++;
            queue[rear] = element;
            for (int i = rear; i > front; i--) {
                if (queue[i] < queue[i - 1]) {
                    //for max priority use(queue[i] > queue[i - 1])
                    int temp = queue[i];
                    queue[i] = queue[i - 1];
                    queue[i-1] = temp;

                }
            }
        }
            size++;

        return response;

    }



// remove(poll/dequeue) element from head of the queue.
    /* This dequeue method is created using O(1), therefore if the number of dequeue is equal to
    the number of queue size then again enqueue is impossible */
public int dequeue(){
    int response=0;
    if(isEmpty()){
        System.out.print("queue is empty ");
    }
    else{
    response=queue[front];
    front++;
    }
    return response;
}


//this method retrieves and return head value of queue
public int peek(){
    int response=0;
    if(isEmpty()){
        System.out.print("queue is empty");
    }
    else{
        response=queue[front];
    }
    return response;
}


public boolean isEmpty(){
    boolean response=false;
    if(front==-1 && rear==-1){
        response=true;
    }
    return response;
}




//optional(this method is only for understanding
    public void traverse(){
        for (int i:queue) {
            System.out.print(i+" ");

        }
    }




}
