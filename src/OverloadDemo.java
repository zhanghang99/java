public class OverloadDemo{
    public static void main(String [] args){
        Printer p=new Printer(1000);
        p.print("hello");
        p.print(100);
        p.print("这个水果",100);
    }
}
class Printer{
    private String brand="惠普";
    private double price;
    public Printer(double price){
        this.price=price;
    }
    public void print(String content){
        System.out.println("字符串"+content);
    }
    public void print(int content){
        System.out.print("整型"+content);
    }
    public void print(String str,int content){
        System.out.println(str+"--"+content);
    }
    public double print(String str,double content){
        return content;
    }
}