public class InterfaceDemo{
    public static void main(String [] args){
        Person p=new Person();
        Child child=new Child();
        Dogs dog=new Dogs();
        p.feed(child);
        p.feed(dog);
    }
}
class Person{
    //接口的引用变量可以引用其实现类的
    public void feed(IAbility ability){
        ability.eat();
    }
}
interface IAbility{
    //接口中只能放公有的静态常量和抽象方法
    /*public static final int number=1;*/
    /*public abstract void show();*/
    void eat();
}
class Child implements IAbility{
    public void eat(){
        System.out.println("吃米饭");
    }
}
class Dogs implements IAbility{
    public void eat(){
        System.out.println("啃骨头");
    }
}