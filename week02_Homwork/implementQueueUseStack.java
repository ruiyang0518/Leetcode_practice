package hw.week02;

import java.util.Stack;

/**
 * Created by 502750454 on 6/22/2017.
 */
public class implementQueueUseStack {

}
class myQueue{
    private Stack stackOne;
    private Stack stackTwo;

    public void add(int x){
        stackOne.push(x);
    }

    public void poll(){
        while(!stackOne.isEmpty()){
            // move stack One to stack two
            stackToStack(stackOne,stackTwo);
        }
        stackTwo.pop();
        stackToStack(stackTwo,stackOne);
    }

    public int peek(){
        while(!stackOne.isEmpty()){
            // move stack One to stack two
            stackToStack(stackOne,stackTwo);
        }
        int x = (int) stackTwo.peek();
        stackToStack(stackTwo,stackOne);
        return x;
    }
    public boolean isEmpty(){
        return stackOne.isEmpty();
    }
    public void stackToStack(Stack from,Stack to){
        while(!from.isEmpty()){
            to.push(from.pop());
        }
    }
}
