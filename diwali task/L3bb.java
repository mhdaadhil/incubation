import java.util.Scanner;
public class L3bb{
	public static void main(String[]args)
	{
		BallBrik bb=new BallBrik();
		bb.settable();
	}
}
class BallBrik{
	Scanner sc = new Scanner(System.in);
	int flag=1;
	int bcount;
	int n;
	
	public void settable(){
		int k;
		System.out.println("enter the size of the n*n mat");
		n =sc.nextInt();
		int r=n/2;
		char arr[][]=new char[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||j==n-1)
				{
					arr[i][j]='W';
					
				}
			
			}
		}
		
		for(int i=1;i<n-1;i++)
		{
			k=n-1;
			if(i==r)
			{
				arr[k][i]='O';
			}
			else{
				arr[k][i]='G';
			}
		}
		printtable(arr);
	}
	public void printtable(char arr[][]){
		
			for(int i=0;i<n;i++)
		    {
			    for(int j=0;j<n;j++)
			   {
				 System.out.print(arr[i][j]+" ");
			   }
			System.out.println();
		    }
			System.out.println("your ball count is "+bcount);
			if (flag==1){
				flag--;
			setbrick(arr);
			}
			else{
				flag++;
				game(arr);
			}
	}
	public void setbrick(char arr[][]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the brick position  :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter the brick type :");
		int c=sc.nextInt();
		if (c==1)
		arr[a][b]=49;
	    
		
		System.out.println("do you  wish to contineue");
		char n=sc.next().charAt(0);
		 if(n=='y')
		 {
			 setbrick(arr);
		 }
		 else{
			 System.out.println("enter the ball count");
			 bcount=sc.nextInt();
			 printtable(arr);
		 }
		
		
	}
	public void game(char arr[][]){
		Scanner sc = new Scanner(System.in);
		int t=0;
		System.out.println("enter the direction in which the ball need to travese");
		String c=sc.next();
		
		if(c.equals("st"))
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr[i][j]=='O')
					{
						t=i;
					
						for(int k=0;k<n;k++,t--)
						{
							if(arr[t][j]>=49&&arr[t][j]<=57)
							{
								arr[t][j]=32;
								break;
								
							}
							
						}
						s=1;
						break;
					}
				}
				if(s==1)
				{
					break;
				}
			}
			System.out.println(bcount);
		 }
			//if(bcount<=0)
			//{
		     printtable(arr);
			//}
			//else
			//{
				//game(arr);
			//}
	
		}
		
		

}

