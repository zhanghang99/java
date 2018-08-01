public class Employee{
    public String name;
    public int age;
    //返回个人信息
    public String toString(){
        return "我的名字叫："+name+",今年："+age+"岁";
    }
    //在指定的字符串中查找相应的字符串出现的次数
    public int countContent(String src,String dst){
        int count=0;
        int index=0;
        index=src.indexOf(dst);
        while(index!=-1){
            count++;
            index+=dst.length();
            index=src.indexOf(dst,index);
        }
        return count;
    }
    public static void main(String [] args){
        Employee emp=new Employee();
        emp.name="张航";
        emp.age=28;
        System.out.println(emp.toString());
        String src="朋友啊朋友，你可曾想起了我！";
        String dst="朋友";
        int count=emp.countContent(src,dst);
        System.out.println(dst+"的次数出现了"+count+"次");
    }
}