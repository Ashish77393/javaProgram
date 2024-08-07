import java.util.*;
public class ArrayTrappedRainWater {
    public static int rainWater(int [] height){
        int n=height.length;
        //calculate left max boundry array in
        int [] leftmax=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate left max boundry array in
        int [] rightmax=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
      int trappedwater=0;
      for(int i=0;i<n;i++){
        int waterlevel=Math.min(leftmax[i],rightmax[i]);
         trappedwater += waterlevel-height[i];
      }
      return trappedwater;
        
    }
    public static void main(String[] args) {
        int [] height={7,6,8};
      int tr= rainWater(height);
       System.out.println("sum of trapped water is="+tr);

    }
}
