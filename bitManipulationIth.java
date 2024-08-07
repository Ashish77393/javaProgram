public class bitManipulationIth {
    public static int getElement(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
        public static int setElement(int n,int i){
     int bitmask1=1<<i;
      return n | bitmask1;
        
   }
   public static int Setclear(int n,int i){
    int bitmask2=~(1<<i);
    return n & bitmask2;
   }



    public static void main(String[] args) {
       System.out.println(getElement(15, 3));
       System.out.println(setElement(10, 2));
       System.out.println(Setclear(10, 1));
    }
}
