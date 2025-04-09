import java.util.*;
abstract class PatternPrinter{
    abstract void printpattern(int n);
}
class StarPattern extends PatternPrinter{
    @Override
     void printpattern(int n){
      for(int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.println("");
      }
}
class NumberPattern extends PatternPrinter{
    @Override
    void printpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("" +j+" ");
            }
            System.out.println("");
        }
}}
class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter no of rows of patttern required to print: ");
        int n=scn.nextInt();
        StarPattern strpat=new StarPattern();
        strpat.printpattern(n);
        System.out.println(" \n");
        NumberPattern numpat = new NumberPattern();
        numpat.printpattern(n);
        scn.close();
        
    }
}}