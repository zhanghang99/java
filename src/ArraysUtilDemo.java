import java.util.Arrays;
public class ArraysUtilDemo{
    public static void main(String [] args){
        int [] arraySrc1={1,3,5,8,6,4};
        int [] arrayDes1=Arrays.copyOf(arraySrc1,10);
        for(int i=0;i<arrayDes1.length;i++){
            System.out.println(arrayDes1[i]);
        }
        System.out.println("**********************");
        int [] arrayDes2=Arrays.copyOfRange(arraySrc1,2,4);
        System.out.println(arrayDes2);
        boolean flag=Arrays.equals(arrayDes1,arrayDes2);
        System.out.println(flag);
        System.out.println("**********************");
        int [] arrayDes3=new int[10];
        Arrays.fill(arrayDes3,10);
        System.out.println(arrayDes3);
    }
}