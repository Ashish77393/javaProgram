
public class ArrraySpirslArray {
    public static void SpiralArray(int[][]a){
      int startrow=0;
      int startcol=0;
      int endrow=a.length-1;
      int endcol=a[0].length-1;  
      while(startrow<=endrow&& startcol<=endcol){
        for(int j=startcol;j<=endcol;j++){
            System.out.print(a[startrow][j]+" ");
        }
        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(a[i][endcol]+" ");
        }
        for(int j=endcol-1;j>=startcol;j--){
            System.out.print(a[endrow][j]+" ");
            if(startrow==endrow){
                break;
            }
        }
         for(int i=endrow-1;i>=startrow+1;i--){
            System.out.print(a[i][startcol]+" ");
             if(startcol==endcol){
                break;
            }
        }
        startcol++;
        startrow++;
        endrow--;
        endcol--;
      }
    }
    public static void main(String[] args) {
        int [][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        SpiralArray(a);
    }
}
