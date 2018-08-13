public class Demo2{
    public static void main(String [] args){
        Myclass class1=new Myclass("zhangsan");
        System.out.println(class1.getData());
        Myclass class2=new Myclass(10);
        System.out.println(class2.getData());
    }
}

class Myclass{
    private Object data;
    public Myclass(Object data){
        this.data=data;
    }
    public void setData(Object data){
        this.data=data;
    }
    public Object getData(){
        return data;
    }
}