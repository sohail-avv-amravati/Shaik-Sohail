import java.util.Scanner;
  class Gratest_of_Three{
  	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		System.out.print("enter three numbers ");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		if(a>b &a>c){
			System.out.println(a+" is gratest");
		}
		else if(b<c & b<a){
			System.out.println(b+" is gratest");
		}
		else{
			System.out.println(c+" is gratest");
		}
	}
}
