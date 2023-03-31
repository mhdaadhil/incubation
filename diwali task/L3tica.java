import java.util.Scanner;
public class L3tica{
	public static void main(String[] args)
	{
		TictacToe ttt= new TictacToe();
		ttt.select();
	}
}
class TictacToe{
	char p1;
	char p2;
	Scanner sc = new Scanner(System.in);
	char ch[][]=new char[3][3];

public void select(){
	
	System.out.println("what you want to be enter 1 for player 1 or 2 for player 2");
	int n =sc.nextInt();
	
	switch(n){
		case 1:
		System.out.println("enter the 1 for x 2 for o");
		int num=sc.nextInt();
		
		if(num==1)
		{
			p1='x';
			p2='o';
			System.out.println(p1+" "+p2);
		}
		
		else 
		{
			p1='o';
			p2='x';
			System.out.println(p1+" "+p2);
		}
		
		break;
		case 2:
		System.out.println("enter the 1 for x 2 for o");
		int m=sc.nextInt();
		if(num==1)
		{
			p2='x';
			p1='o';
			System.out.println(p1+" "+p2);
		}
		else 
		{
			p2='o';
			p1='x';
			System.out.println(p1+" "+p2);
		}
		break;
		
		
	}
}
public void player1(){
	
}
public void player2(){
	
}
public void game(){
	
}
}