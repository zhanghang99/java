import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo{
    public static void main(String [] args){
        Date date=new Date();
        System.out.println(date);//Fri Aug 03 22:02:44 CST 2018
        System.out.println(date.getTime());//1533304964585
        date.setTime(1533304607652L);
        System.out.println(date);//Fri Aug 03 21:56:47 CST 2018

        DateFormat df1=null;
        DateFormat df2=null;
        df1=DateFormat.getDateInstance();
        df2=DateFormat.getDateTimeInstance();
        System.out.println("Date:"+df1.format(date));//Date:2018-8-3
        System.out.println("DateTime:"+df2.format(date));//DateTime:2018-8-3 21:56:47
        df1=DateFormat.getDateInstance(DateFormat.FULL,new Locale("zh","CN"));
        df2=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        System.out.println("Date:"+df1.format(date));
        System.out.println("DateTime:"+df2.format(date));

        String strDate="2010-10-19 10:11:30.345";
        Date d=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss.SSS");
        try{
            d=sdf.parse(strDate);
        }catch(Exception e){

        }
        System.out.println(d);
        String str=sdf1.format(d);//把日期按指定的模板格式输出
        System.out.println(str);
    }
}