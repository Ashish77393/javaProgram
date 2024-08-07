
public class funnctionArray {
    void arrayFun(int marks[]){
    for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
        System.out.println(marks[i]);
    }
    }
    public static void main(String[] args) {
        int marks[]={34,66,88};
        funnctionArray B=new funnctionArray();
   B. arrayFun(marks);
    
    }
}
