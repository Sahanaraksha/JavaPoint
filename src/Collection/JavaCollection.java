package Collection;

//peeking = getting the head of array.
//polling=removing head of the array.

import java.util.Iterator;
import java.util.PriorityQueue;

public class JavaCollection {
    public static void main(String args[]){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vicky");
        queue.add("Shankar");
        queue.add("Raj");
        queue.add("Suresh");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements :");
        Iterator itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing three elements: ");
        Iterator<String> itr3 = queue.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());

        }

    }
}
