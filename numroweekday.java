import java.util.Scanner;
class numtoweekday{
    int num=0;
    Scanner scn=new Scanner(System.in);
    void getnum(){
        System.out.println("Enter a number between 1 and 7:");
        num=scn.nextInt();
    }
   void display(){

        if(num<1 || num>7){
            System.out.println("Invalid number. Please enter a number between 1 and 7.");
    }
    else{
        if(num==1){
            System.out.println("Monday");
        }
    else if(num==2){
        System.out.println("Tuesday");
    }
    else if(num==3){
        System.out.println("Wednesday");
    }
    else if(num==4){
        System.out.println("Thursday");
    }
    else if(num==5){
        System.out.println("Friday");
    }
    else if(num==6){
        System.out.println("Saturday");
    }
    else if(num==7){
        System.out.println("Sunday");
    
    }
    }
    }
}
class printingday{
    public static void main(String args[]){
        numtoweekday obj=new numtoweekday();
        obj.getnum();
        obj.display();
    }
}