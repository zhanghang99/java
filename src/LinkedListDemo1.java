import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String [] args){
        MyStack<String> myStack=new MyStack<String>();
        myStack.push("zhangsan");
        myStack.push("lisi");
        myStack.push("wanwu");
        myStack.pop();
        myStack.pop();
        Iterator<String> it = myStack.iterator();
        while (it.hasNext()){
            System.out.println(it.hasNext());
        }

        MyQueue<Integer> myQueue=new MyQueue<Integer>();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.pop();
        myQueue.pop();
        Iterator<Integer> its = myQueue.iterator();
        while (its.hasNext()){
            System.out.println(its.hasNext());
        }
    }
}
class MyStack<T>{
    private LinkedList<T> data=null;
    public MyStack(){
        data=new LinkedList<T>();
    }
    public void push(T obj){
        data.addFirst(obj);
    }
    public T pop(){
        return data.removeFirst();
    }
    public Iterator<T> iterator(){
        return data.iterator();
    }
}
class MyQueue<T>{
    private LinkedList<T> data=null;
    public MyQueue(){
        this.data=new LinkedList<T>();
    }
    public void push(T obj){
        data.addFirst(obj);
    }
    public T pop(){
        return data.removeLast();
    }
    public Iterator<T> iterator(){
        return data.iterator();
    }
}