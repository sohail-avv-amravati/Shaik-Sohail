import java.util.*;
class Simplecaluclator{
    public void add(float a, float b){
        System.out.println("Addition : "+(a+b));
    }   
    public void difference(float a, float b){
        System.out.println("Subtraction : "+(a-b));
}
}
class supercaluclator extends Simplecaluclator{
    public void multipication(float a, float b){
        System.out.println("Multipicatio : "+(a*b));
}
}
class superiorcaluclarot extends supercaluclator{
    public void division(float a, float b){
        if(b!=0){
            System.out.println("Divison : "+(a/b));
        } 
        else{
            System.out.println("Divion cannot br done when denominator is zero");
        }
    }
}
    class Final_Caluclator {
        public static void main(String[] args) {
            Scanner scr=new Scanner(System.in);
            System.out.println("Enter the two numbers : ");
            float a=scr.nextFloat();
            float b=scr.nextFloat();
            superiorcaluclarot obj=new superiorcaluclarot();
            obj.add(a,b);
            obj.difference(a,b);
            obj.multipication(a,b);
            obj.division(a,b);
        }
    }
