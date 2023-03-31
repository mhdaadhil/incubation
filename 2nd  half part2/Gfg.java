import java.util.Scanner;
public class Gfg{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for (int i=0;i<b;i++){
			if (i*i>=a&&i*i<=b)
			{
				System.out.println(i*i);
			}
		}
	}
}