//package com.iotek.List;
import java.util.ArrayList;
public class ArrayLists{
    public static void main(String [] args){
        ArrayList<String> nList=new ArrayList<String>();
        nList.add("1");
        nList.add("2");
        nList.add("3");
        nList.add(1,"4");
        nList.set(0,"5");
        for(String name:nList){
            System.out.println(name);
        }
        System.out.println(nList);
        System.out.println(nList.indexOf("2"));
        System.out.println(nList.remove("2")+"2");
        System.out.println(nList.remove(0));
        System.out.println(nList.size()+"size");
        System.out.println(nList);
        System.out.println(nList.contains("2"));
        System.out.println(nList.get(0));
        System.out.println(nList.isEmpty());
        nList.clear();
    }
}