import java.util.Scanner;
public class Day1q9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a=0;
		for (int i=1;i<n;i++){
			if(n%i==0){
				a=a+i;
			}
		}
		if (a==n)
			System.out.println(true);
		else
			System.out.println(false);
	}
}