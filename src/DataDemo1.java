public class DataDemo1{
    public static void main(String [] args){
        //自动类型转换（隐氏转换）只能将小的字符类型赋值给大的数据类型 大小是以值来区分  不是以类型的所占内存字节来分大小
        byte num1=10;
        int num2=num1;
        System.out.println(num2);
        long num3=num2;
        System.out.println(num3);

        float f=10.5f;
        double d=f;
        System.out.println(d);

        int num4=100;
        float num5=num4;
        System.out.println(num5);

        char c1='a';
        int num6=c1;//隐式将char类型转化成int类型，因为char和int都是数字类型
        System.out.println(c1);
        System.out.println(num6);
        System.out.println(c1+10);

//        强制类型转换（显示转换）,将大值强制转换成小值
//        byte<short(char)<int<long<float<double
        int num7=10;
        short num8=(short)num7;
        System.out.println(num8);

        float num9=(float)10.25;
        System.out.println(num9);

        int num10=10;
        char num11=(char)num10;
        System.out.println(num11);

        int num12=10;
        double num13=10.6;
        double res=num12+num13;
        System.out.println(res);
        System.out.println(5/0.5);
    }
}