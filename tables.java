import java.util.Scanner;
class Tables{
    int num,multplyer;
    Scanner scr=new Scanner(System.in);
    void table(){
    System.out.print("enter ehich table you want to print");
    num=scr.nextInt();
    System.out.print("enter the no of terms required in table");
    multplyer=scr.nextInt();

}
void Table(){
    for (int i=1;i<=multplyer;i++){
        System.out.println(num+"*"+i+"="+num*i);
    }

        
}
class printing_table{
    public static void main(String args[]){
        Tables t=new Tables();
        t.table();
        t.Table();
    }
}}