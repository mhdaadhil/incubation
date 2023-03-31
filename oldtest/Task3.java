import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int temp[]=new int[n];
	int count=0;
	System.out.println("enter the element");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		temp[i]=-1;
	}
	for(int i=0;i<n;i++)
	{
		count=1;
		for(int j=0;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				temp[j]=0;
				count++;
			}
			if(temp[i]!=0)
			{
				temp[i]=count;
			}
		}
	}
    int max=0;
    for(int i=0;i<n;i++)
    {
    	if(max<temp[i])
    	{
    		max=i;
    	}
    }
    System.out.println(arr[max]);
	
}
}