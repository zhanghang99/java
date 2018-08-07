import java.util.Random;
public class MathRandomDemo{
    public static void main(String [] args){
        System.out.println(Math.floor(10.55));
        System.out.println(Math.ceil(-10.55));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.round(10.5));
        System.out.println(Math.random());

        Random random=new Random();
        System.out.println(random.nextInt());
    }
}