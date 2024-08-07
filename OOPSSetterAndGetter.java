class pen{
    private String color;
   private  int tip;
String getColor(){
        return this.color;
    }
    int getTip(){
        return tip;
    }
    void setColor(String color){
        this.color=color;
    }
     void setTip(int tip){
        this.tip=tip;
    }
}




public class OOPSSetterAndGetter {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setColor("red");
        p1.setTip(8);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}
