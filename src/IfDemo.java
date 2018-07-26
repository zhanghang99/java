public class IfDemo{
    public static void main(String [] args){
        int num1=1;
        if(num1==10){
            System.out.println("这是1");
        }else{
            System.out.println("这是2");
        }
        int a=1;
        int b=2;
        int c;
        c=a>1?b:a;
        System.out.println(c);
        int cash=100;
        if(cash>100){
            System.out.println("大于100");
        }else if(cash<100){
            System.out.print("小于100");
        }else if(cash==100){
            System.out.print("等于100");
        };
        int e=1;
        int f;
        switch(e){
            case 1:
                f=1;
                break;
            case 2:
                f=2;
                break;
            default:
                f=3;
        }
        System.out.println("f:"+f);
    }
}