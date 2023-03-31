import java.util.Scanner;
public class Day1q10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		int flag=0;
		for (int i=1;i<c;i++)
		{
		  for(int j=i+1;j<c;j++){
			if((i*i)+(j*j)==c)
				{
					flag=1;
				}
				
			}
		}
		if (flag==1)
		System.out.println(true);
	    else 
			System.out.println(false);
		
	}
}