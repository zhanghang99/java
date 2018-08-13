import java.util.*;
import java.util.ArrayList;

public class HashMapDemo1{
    public static void main(String [] args){
        HashMap<String,Object> map= new HashMap<String,Object>();
        ArrayList arr=new ArrayList();
        arr.add(1);
        map.put("jay","zhangsan");
        map.put("jay","lisi");
        map.put("rose","meigui");
        map.put("arr",arr);
        System.out.println(map);
        System.out.println(map.get("jay"));
        //获取map中的所有键
        Set<String> keys= map.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        //获取map中的所有值
        Collection<Object> values=map.values();
        for(Object value:values){
            System.out.println(value);
        }
        //当我们调用put(key,value)方法的时候，首先会把key和value封装到Entry这个静态内部
        //类对象中，把Entry对象再添加到数组中，所以我们想获取map中的所有键值对，我们只要取数组中的所有Entry对象
        //接下来调用Entry对象中的getKey和getValue方法就能获取键值对
        Set<Map.Entry<String, Object>> entrys = map.entrySet();
        for(Map.Entry<String,Object> entry:entrys){
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        }
    }
}