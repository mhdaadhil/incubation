import java.util.Scanner;
public class Tl2q4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st num :");
		int a=sc.nextInt();
		
		System.out.println("enter the 2st num :");
		int b=sc.nextInt();
		
		System.out.println("enter the 3st num :");
		int c=sc.nextInt();
		
		Average a1=new Average(a,b,c);
		a1.calculate();
	}
}
class Average{
	int a;
	int b;
	int c;
	public Average(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void calculate(){
		int d=(a+b+c)/3;
		System.out.println("the average of three number is : "+d);
		
	}
}