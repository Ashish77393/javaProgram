import java.util.Arrays;

public class SortInbuilt {
    public static void Arr(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print(" ");
    }
    public static void main(String[] args) {
        int a[]={3,2,6,2,8,6};
        Arrays.sort(a,0,6);
        Arr(a);
    }
    
}
