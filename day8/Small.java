import java.util.Scanner;

public class Small{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		float a =sc.nextInt();
		float b =sc.nextInt();
		float c =sc.nextInt();
		float small1=small(a,b,c);
		System.out.println("the smallest number is "+small1);
	}
	public static float small(float x,float y,float z)
		{
			if (x<=y&&x<=z)
				return x;
			else if (y<=x&&y<=z)
				return y;
			else  
		     return z;
		}
	}
