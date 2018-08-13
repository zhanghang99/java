import java.util.LinkedList;
public class LinkedListDemo{
    public static void main(String [] args){
        //LinkedList它内部封装的是双向链表数据结构
        //每个节点是一个Node对象，Node对象中封装的是你要添加的元素，
        //还有一个指向上一个Node对象的应用和指向下一个Node对象的引用,
        //ArrayList数组结构，它做查询的时候效率高，因为可以通过下标直接查找到元素
        //但插入和删除效率比较低，因为可以可以通过下标直接找到元素
        LinkedList<String> sList=new LinkedList<String>();
        sList.add("zhangsan");
        sList.add("lisi");
        sList.addFirst("chenghao");
        for(String name:sList){
            System.out.println(name);
        }
        System.out.println(sList.size());
    }
}