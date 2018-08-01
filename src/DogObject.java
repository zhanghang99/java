public class DogObject{
    public String brand;
    public int age;
    public String toString(){//设置的是一个String类型，返回的结果就要是一个String类型
        return "这是一条"+age+"岁的"+brand;
    }
    public static void main(String [] args){
        DogObject dog=new DogObject();
        dog.brand="中华田园犬";
        dog.age=3;
        System.out.println(dog.toString());
    }
}