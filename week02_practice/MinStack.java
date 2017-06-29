package week02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Created by 502750454 on 6/29/2017.
 */
public class MinStack {
//
//    public static void main(String[] args) {
//        MinStack m = new MinStack();
//        m.push(-2);
//        m.push(0);
//        m.push(-3);
//        System.out.println((int)m.getMin());
//        m.pop();
//        System.out.println(m.top());
//
//        System.out.println(m.getMin());
//    }

    private Deque minstack;
    private Deque normalStack;

    public MinStack(){
        minstack = new ArrayDeque<Integer>();
        normalStack = new ArrayDeque<Integer>();
    }

    public void push(int x){
        normalStack.addLast(x);
        if(minstack.isEmpty()){
            minstack.addLast(x);
        }else{
            minstack.addLast((int)minstack.peek()<x ? minstack.peek():x);
        }
    }
    public void pop(){

        minstack.removeLast();
        normalStack.removeLast();
}
    public int top(){
        return (int)normalStack.peekLast();
    }
    public int getMin(){
        return (int)minstack.peekLast();
    }


}
