public class AnimalDemo{
    public static void main(String [] args){
        //父类的引用变量可以引用其子类的对象
        Animal animal1=new Dog("旺财");//子类向父类向上转型
        animal1.eat();
        Animal animal2=new Cat("招财猫");
        animal2.eat();
        if(animal1 instanceof Cat){
            Cat cat=(Cat)animal1;
        }
    }
}
class Animal{
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(){

    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    //重写父类方法
    public void eat(){
        System.out.println("啃骨头");
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    //重写父类方法
    public void eat(){
        System.out.println("吃鱼");
    }
}