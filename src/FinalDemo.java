public class FinalDemo{
    public static void main(String [] args){
        A a=new A();
        a.showNumber1();
        B b=new B();
        b.showNumber2();
        final  A a2=new A();
        a2.number2=5;
        a2.showNumber2();
    }
}
class A{
    public final int number1=1;//常量
    public int number2=2;
    public void showNumber1(){
        System.out.println(number1);
    }
    public void showNumber2(){
        System.out.println(number2);
    }
}
class B extends A{
    public void showNumber2(){
        System.out.println(number2);
    }
}