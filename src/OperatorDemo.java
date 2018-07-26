public class OperatorDemo{
    public static void main(String [] args){
        int num1=10;
        int num2=8;
        int res=num1+num2;
        System.out.println(res);
        String str="操作结果:";
        System.out.println(str+res);
        System.out.println(str+res+10);
        System.out.println(res+10+str);
        System.out.println(str+(res+10));

        short s=5;
        s+=3;
        System.out.println(s);
    }
}