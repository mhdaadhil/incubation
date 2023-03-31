import java.util.Scanner;
public class L3tic{
	public static void main(String []args){
		TicTacToe ttt=new TicTacToe();
		ttt.setelements();
		
	
		
	}
}
class TicTacToe
{
	Scanner sc = new Scanner(System.in);
	int arr[][]=new int[3][3];
	//String arr1[]=new String[3][2];
	char ch[][]=new char[3][3];
	char c='X';
	char a=48;
	char p1;
	char p2;
	
 public void setelements(){
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print((ch[i][j]=++a)+" ");
			}
			System.out.println();
		}
			select();
			
	}
		public void print(){
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print((ch[i][j])+" ");
			}
			System.out.println();
			
		}
	}
	     		
	 public void p1(){
	
		System.out.println("enter the num ");
		int m=sc.nextInt();
		switch(m)
		{
			case 1:
			if(p1=='x'){
			  ch[0][0]='x';
		      p2();
			  print();
			}
		    else{
			  ch[0][0]='o';
			}
			print();
		    break;
			
		
		}
		
	}
	public void p2(){
		System.out.println("enter the num ");
		int m=sc.nextInt();
		game(m);
	}
	public void game(int m){
		
		switch(m)
		{
			case 1:
			if(p1=='x'){
			  ch[0][0]='x';
		      p2();
			  print();
			}
		    else{
			  ch[0][0]='o';
			}
			print();
		    break;
			
		
		}
	}
}
