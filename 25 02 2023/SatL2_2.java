import java.util.Scanner;
public class SatL2_2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		String arr[]= new String[n];
		String str[]= new String[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			str[i]=sort(arr[i]);
		}
		//for(int i=0;i<n;i++)
		//{
			//System.out.print(str[i]+" ");
		//}
		//System.out.println();
		for(int i=0;i<n;i++)
		{
			if(!str[i].equals("null"))
			{
				System.out.print(arr[i]+" ");
			  for(int j=i+1;j<n;j++)
			  {
				if(str[i].equals(str[j]))
				{
					System.out.print(arr[j]+" ");
					str[j]="null";
				}
			  }
			  System.out.println();
		    }
			else
				continue;
		}
	}
	public static String sort(String word){
		
	  char arr[]=word.toCharArray();
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr.length-i-1;j++)
		  {
			  if(arr[j]>arr[j+1])
			  {
				  char temp=arr[j];
			      arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
		  }
	  }
	  String res="";
	  for(int i=0;i<arr.length;i++)
		  res+=arr[i];
	  return res;

	  
}
}