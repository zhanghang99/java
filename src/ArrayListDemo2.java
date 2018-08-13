import java.util.ArrayList;
public class ArrayListDemo2{
    public static void main(String [] args){
        ArrayList<Student1> stuList=new ArrayList<Student1>();
        Student1 stu1=new Student1("zhansan",10);
        Student1 stu2=new Student1("lisi",10);
        Student1 stu3=new Student1("wanwu",10);
        Student1 stu4=new Student1("mary",10);
        System.out.println(stu1.getName());
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        stuList.add(stu4);
        Student1 stu5=new Student1("ma",20);
        System.out.println(stuList.indexOf(stu5));
        System.out.println(stuList.remove(stu5));
        System.out.println(stuList.indexOf(stu5));
    }
}
class Student1{
    private String name;
    private int age;
    public Student1(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public void setNmae(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}