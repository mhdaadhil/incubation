import java.util.Scanner;
public class Pairprime{
	public static void main(String[] args )
	{
		int n1,n2,flag;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the starting number");
		n1 = sc.nextInt();
		System.out.println("enter the ending number");
		n2 = sc.nextInt();
		for (int i=n1;i<n2;++i)
		{
			flag=0;
			for (int j=2;j<i/2;j++)
			{
				if (i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i+","+i);
		    }
	}
}
}