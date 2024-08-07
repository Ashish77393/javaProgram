
public class PairsInArray {

    // using Method find numbers of Elements in array
    void pairsArray(int a[]){
        int tp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int curr=a[i];
                System.out.print("("+curr+","+a[j]+") ");
                tp++;
            }
            System.out.println(" ");
        }
        System.out.println("Total pairs is = "+tp);
    }
    public static void main(String[] args) {
       
        int a[]={2,4,6,8,10};

       // normal find pairs without using method
        for(int i=0;i<a.length-1;i++){
         for(int j=i+1;j<a.length;j++){
            int curr=a[i];
            System.out.print("("+curr+","+a[j]+")");
           
         }
         System.out.println(" ");
        }
        PairsInArray P=new PairsInArray();
        P.pairsArray(a);


        //totals pairs of elements in array find
        int num=a.length;
        int tp=num*(num-1)/2;
        System.out.println("Totals pairs of elements in array is using formula= " +tp);
    }
    
}
