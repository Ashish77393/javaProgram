public class StringCompare {
    public static void substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr=substr+str.charAt(i);
        }
        System.out.println(substr);
    }
    public static void main(String[] args) {
        String s1="ashish kumar";
        String s2="ashish";
        String s3=new String("sanjai");
    
if(s1.equals(s2)){
    System.out.println("Equals");
}else{
    System.out.println("not equals");
}
    System.out.println(s1.substring(2,9));
    substring(s1, 1, 10);

    }
}
