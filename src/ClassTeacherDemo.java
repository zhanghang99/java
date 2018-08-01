public class ClassTeacherDemo{
    public static void main(String [] args){
        Teacher t=new Teacher();
        t.setName("张航");
        System.out.println(t.getName());
        t.setAge(25);
        System.out.println(t.getAge());
    }
}
class Teacher{
    private String name;
    private int age;
    public void setName(String tname){
        name=tname;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int tage){
        if(tage<25){
            System.out.println("年龄太小了！");
        }else{
            age=tage;
        }
    }
}