package hw.week02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by 502750454 on 6/22/2017.
 */
public class implementStackUseQueues {
    // if pop to the end what should the program return
    public static void main(String[] args) {
        MyStack m = new MyStack();
        m.push(-2);
        m.push(6);
        m.push(9);
    }
}

class MyStack{

    private Queue queueOne;
    private Queue queueTwo;

    public MyStack(){
        queueOne = new LinkedBlockingQueue();
        queueTwo = new LinkedBlockingQueue();
    }
    public void push(int x){
        queueOne.offer(x);
    }
    public void pop(){
        while(queueOne.size()>=1){
            queueTwo.offer(queueOne.poll());
        }
        queueOne = queueTwo;
        queueTwo = new LinkedBlockingQueue();
    }
    public boolean isEmpty(){
        return queueOne.isEmpty();
    }
    public int peek(){
        if(!queueOne.isEmpty()) {
            while (queueOne.size() > 1) {
                queueTwo.offer(queueOne.poll());
            }
            int x = (int) queueOne.poll();
            queueOne = queueTwo;
            queueTwo = new LinkedBlockingQueue();
            return x;
        }
        return 0;
    }
}

