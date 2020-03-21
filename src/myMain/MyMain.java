package myMain;
import PriorityQueue.*;


public class MyMain {
    public static void main(String[] args){
        MyPriorityQueueUsingArray obj=new MyPriorityQueueUsingArray(5);
        obj.enqueue(4);

        System.out.println("peek= "+obj.peek());

        obj.enqueue(2);
        obj.enqueue(9);
        obj.enqueue(1);
        System.out.println("dequeue= "+obj.dequeue());
        System.out.println("dequeue= "+obj.dequeue());

        System.out.println("peek= "+obj.peek());

        System.out.println("dequeue= "+obj.dequeue());
        System.out.println("dequeue= "+obj.dequeue());
        System.out.println("dequeue= "+obj.dequeue());
        obj.traverse();

    }

}
