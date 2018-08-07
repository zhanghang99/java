public class StringBuilderDemo{
    public static void main(String [] args){
        StringBuilder sb1=new StringBuilder();//默认16个字符大小
        StringBuilder sb2=new StringBuilder(100);//初始化容量大小
        StringBuilder sb3=new StringBuilder("abc");//初始化容量大小
        sb1.append("hello");
        sb1.append(1);
        sb1.append(1.5);
        sb1.append(true);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.insert(5,"  world");
        System.out.println(sb1.toString());
        sb1.replace(5,7,"el");
        System.out.println(sb1.toString());
        System.out.println(sb1.indexOf("el"));
    }
}