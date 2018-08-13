import java.util.Arrays;
public class MyContainer{
    public static void main(String [] args){
        IContainer<String> list= new ArrayList<String>();
        for(int i=0;i<12;i++){
            list.add("data:"+(i+1));
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
interface IContainer<T>{
    public void add(T obj);
    public T get(int index);
    public int size();
}
class ArrayList<T> implements IContainer<T>{
    private Object[] data=null;
    private int size=0;//记录容器中元素的个数
    public ArrayList(){
        data=new Object[10];
    }
    public ArrayList(int capacity){
        data=new Object[capacity];//指定容器的大小
    }
    public void add(T obj){
        //判断元素的个数是否已经超过了容器的大小，超过了
        //应该对容器进行扩容
        ensureCapacity(size+1);
        data[size++]=obj;//添加元素
    }
    private void ensureCapacity(int capacity){
        if(capacity>data.length){
            int oldCapacity=data.length;//获取原有数组容量大小
            int newCapacity=oldCapacity+(oldCapacity>>1);//扩容为原有数据的1.5倍
            data=Arrays.copyOf(data,newCapacity);//把原有数组中的
        }
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
}