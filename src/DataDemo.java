public class DataDemo{
    public static void main(String [] args){
        //数字类型
        byte age=20;//byte最大值为127；
        System.out.println(age);
        short number1=200;
        int number2=100;
        long number3=2000L;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        float data1=0.5f;//不能直接为小数，0.5算double类型
        double data2=10.2;
        double data3=.125;
        double data4=0.3568;
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);


        //boolean类型
        boolean flag=true;
        System.out.println(flag);


        //字符型  必须要单引号
        //char类型使用的是unicode字符编码 会将个的值unicode码或者数字转化成unicode码所对应的文字
        char cl='A';
        char c2='\u0041';
        char c3=97;
        System.out.println(cl);
        System.out.println(c2);
        System.out.println(c3);
    }
}