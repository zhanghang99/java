import java.util.Arrays;

public class MyStringBulider{
    public static void main(String [] args){
        MyStringBuilder msb=new MyStringBuilder();
        msb.append("hello");
        msb.append(" world").append(",java");
        System.out.println("字符个数："+msb.length());
        System.out.println("总容量大小："+msb.capacity());
        System.out.println("输出字符串："+msb.toString());
    }
}
class MyStringBuilder{
    private char [] value;
    private int count=0;
    public MyStringBuilder(){
        value=new char[16];
    }
    public MyStringBuilder(int capacity){
        value=new char[capacity];
    }
    public MyStringBuilder(String str){
        value=new char[str.length()+16];
    }
    public int length(){
        return count;
    }
    public int capacity(){
        return value.length;
    }
    public MyStringBuilder append(String str){
        int len=str.length();
        ensureCapacity(count+len);
        str.getChars(0,len,value,count);
        count+=len;
        return this;
    }
    private void ensureCapacity(int capacity){
        if(capacity>value.length){
            int newCapacity=value.length*2+2;
            value=Arrays.copyOf(value,newCapacity);
        }
    }
    public String toString(){
        return new String(value,0,count);
    }
}