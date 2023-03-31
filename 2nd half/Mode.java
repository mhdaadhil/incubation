import java.util.Scanner;
public class Mode{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("entetr the element size ");
		int count;
		int n=sc.nextInt();
	    int arr[]=new int[n];
		int arr1[]=new int[10];
       System.out.println("enter the elements");
	   for (int i=0;i<n;i++)
	   {
		   arr[i]=sc.nextInt();
		  // arr1[i]=-1;
	   }
	   for (int i=0;i<n;i++)
		{
			count=1;
			for (int j=i+1;j<n;j++)
			{
				if (arr[i]==arr[j])
				{
				count++;
				arr1[j]=-1;
				}	
			}
			if(arr1[i]!=-1);
			arr1[arr[i]]=count;
		}
		for (int i=0;i<10;i++)
		{
			System.out.print(arr1[i]);
		}
}
}