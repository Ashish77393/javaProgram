import java.util.*;
public class ArrayListSumpair {
    public static void sumTarget(ArrayList<Integer>list){
        int target=4;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int target1= list.get(i)+list.get(j);
                if(target1==target){
                  System.out.println("("+list.get(i)+" , "+list.get(j)+")");     
                }
                      
             }    
        }
        System.out.println("pair not found in arraylist");
    }
    public static void main(String[] args) {
        ArrayList <Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        sumTarget(list);
    }
    
}
