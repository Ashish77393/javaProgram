public class ArraySumDiogonalelementsArray {
    public static int Diogonal(int a[][]){
        int sum=0;
        for(int i=0;i<a.length;i++){
        sum=sum+a[i][i];
        if(i!=a.length-1-i)
        sum=sum+a[i][a.length-1-i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int a[][]={
                   {1,2,3},
                   {4,5,6},
                   {7,8,9}
                  };
       int sumDio= Diogonal(a);
       System.out.println("sum of diogonal elemmnts array elements is:"+sumDio);
        
    }
}
