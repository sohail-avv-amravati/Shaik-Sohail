import java.util.Scanner;
class Finding_the_relation_between_three_numbers{
    int a,b,c;
    Scanner scr=new Scanner(System.in);
    void inpt(){
        System.out.println("Enter three numbers a ,b and c:");
        a=scr.nextInt();
        b=scr.nextInt();
        c=scr.nextInt();
    }
    void sample_output(){
    if(a>b && a>c && b>c){
        System.out.println("decreasing");
    }
    else if(a<b && a<c && b<c){ 
        System.out.println("increasing");
    }
    else{
        System.out.println("neither increasing nor decreasing");
    }
            }}
class finaloutput{
public static void main(String[] args) {
    Finding_the_relation_between_three_numbers order=new Finding_the_relation_between_three_numbers();
    order.inpt();
    order.sample_output();

    
}
}

