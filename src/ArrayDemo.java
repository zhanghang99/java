import javax.swing.plaf.synth.SynthScrollBarUI;

public class ArrayDemo{
    public static void main(String [] args){
        int [] array = new int[3];
        System.out.println(array.length);
        array[0]=1;
        array[1]=2;
        array[2]=3;
        System.out.println(array[1]);
//        System.out.println(array[3]);不能越界访问或赋值
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}