public class ObjectDemo{
    public static void main(String [] args){
        Student stu1=new Student("jack",20);
        System.out.println(stu1.toString());
        Student stu2=new Student("jack",20);
        System.out.println(stu1.equals(stu2));
    }
}
class Student extends Object{
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "姓名："+this.name+",年龄："+this.age;
    }
}