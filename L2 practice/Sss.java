import java.util.Scanner;

public class Sss{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		s+=" ";
		int n;
		int k=0;
		char arr[]=s.toCharArray();
		//for(int i=0;i<arr.length;i++)
			//System.out.println(arr[i]);
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=97&&arr[i]<=122)
			{
				if((arr[i+1]>=48&&arr[i+1]<=57)&&(arr[i+2]>=48&&arr[i+2]<=57))
				{
					k=i+1;
					n=0;
					
				n=(int)(arr[k]-48)*10+(arr[k+1]-48);
					
				}
				
				else
				n=(int)arr[i+1]-48;
			
				//System.out.println(n+"n value");
				for(int j=0;j<n;j++)
				{
					System.out.print(arr[i]);
				}
			}
		}
		
		
		

		
	}
}
