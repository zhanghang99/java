public class LinearSearch{
    public static void main(String [] args){
        int [] array = {10,100,80,50,70,60,90};
        System.out.println("请输入要查找的数");
        int number=60;
        int index=-1;
        for(int i =0;i<array.length;i++){
            if(array[i]==number){
                index=i+1;
                break;
            }
        }
        if(index!=-1){
            System.out.println("找到了，在数组的"+index+"位置上");
        }else{
            System.out.println("没找到");
        }
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("最大数："+max);
        System.out.println("最小数："+min);
    }
}