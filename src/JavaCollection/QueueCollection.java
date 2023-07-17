package JavaCollection;

import java.util.concurrent.ArrayBlockingQueue;

public class QueueCollection {
    public static void main(String[] args) throws InterruptedException {
//        ArrayBlockingQueue: Array + Blocking when queue is full when using put to add Objects
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
        queue.add("Kyle");
        queue.offer("Kenny");
        queue.add("Kyle");
        queue.add("Kyle");
//        offer method will return false when queue collection full
        boolean res1 = queue.offer("Stan");
        System.out.println(res1);
        boolean res2 = queue.offer("Butters");
        System.out.println(res2);
        System.out.println(queue);
        Object kyleObj = queue.poll();
        System.out.println(kyleObj.toString());
        System.out.println(queue);
        Object kennyObj = queue.poll();
        System.out.println(kennyObj);
        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
        System.out.println(queue.take());
        System.out.println(queue.size());

    }
}
