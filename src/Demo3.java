public class Demo3{
    public static void main(String [] args){
        //实例化一个泛型类
        GenClass<String> gen1=new GenClass<String>("chenhao");
        System.out.println(gen1.getData());
        GenClass<Integer> gen2=new GenClass<Integer>(10);
        System.out.println(gen2.getData());

        GenClass<GenClass<Students>> gen3=new GenClass<GenClass<Students>>();
        GenClass<Students> gen4=new GenClass<Students>();
        gen4.setData(new Students("张三"));
        gen3.setData(gen4);
        System.out.println(gen3.getData().getData().toString());
    }
}

//创建一个泛型类
class GenClass<T>{
    private T data;
    public GenClass(){
    }
    public GenClass(T data){
        this.data=data;
    }
    public void setData(T data){
        this.data=data;
    }
    public T getData(){
        return data;
    }
}
class Students{
    private String name;
    public Students(String name){
        this.name=name;
    }
    public String toString(){
        return "我是："+name;
    }
}