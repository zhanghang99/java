public class Demo1{
    public static void main(String [] args){
        Myclass1 class1=new Myclass1("zhangsan");
        System.out.println(class1.getData());
        Myclass2 class2=new Myclass2(10);
        System.out.println(class2.getData());
    }
}
class Myclass1{
    private String data;
    public Myclass1(String data){
        this.data=data;
    }
    public void setData(String data){
        this.data=data;
    }
    public String getData(){
        return data;
    }
}
class Myclass2{
    private int data;
    public Myclass2(int data){
        this.data=data;
    }
    public void setData(int data){
        this.data=data;
    }
    public int getData(){
        return data;
    }
}