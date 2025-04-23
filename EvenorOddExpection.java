import java.util.*;
public class week9_1{
    public static void checknumber(int n)
        throws Exception{
        // check if the number is even or odd
        if(n%2==0){
            throw new Exception("Even number is not allowed: " + n);
        }else{
            System.out.println("Odd number is allowed"+n);
        }

        }
        public static void main(String[]args){
            Scanner scr=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n=scr.nextInt();
            try{
                checknumber(n);
            }catch(Exception e){
                System.out.println("Expection catched"+e.getMessage());
            }
        }
    }
