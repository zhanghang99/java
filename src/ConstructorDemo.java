public class ConstructorDemo{
    public static void main(String [] args){
        City c=new City("深圳");
        c.setCity("武汉");
        System.out.println(c.getCity());
    }
}
//当一个雷没有显示声明一个构造方法的时候，系统会有一个默认的无参构造方法
class City{
    private String city;
    //类的构造方法，名字必须与类名一致
    public City(String City){
        this.city=City;
    }
    public void setCity(String City){
        this.city=City;
    }
    public String getCity(){
        return city;
    }
}