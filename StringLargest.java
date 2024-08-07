public class StringLargest {
  public static void main(String[] args) {
    String [] fruit={"banana","apple","orange","mango"};
      String Largest=fruit[0];
    for(int i=0;i<fruit.length;i++){
       
        if(Largest.compareToIgnoreCase(fruit[i])<0){
            Largest=fruit[i];
        }
    }
    System.out.println("largest String is ="+Largest);
  }  
}
