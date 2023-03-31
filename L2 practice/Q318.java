import java.util.Scanner;
public class Q318{
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int n =sc.nextInt();
	   String arr[]=new String[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=sc.next();
	   }
	   String sor[]=new String[n];
	   for(int i=0;i<n;i++)
	   {
		   sor[i]=sort(arr[i]);
	   }
	  // for(int i=0;i<n;i++)
	   //{
		 //  System.out.print(sor[i]+" ");
	   //}
	   //System.out.println();
	   for(int i=0;i<n;i++)
	   {
		   if(!sor[i].equals(null))
		   for(int j=i+1;j<n;j++)
		   {
			   if(sor[i].equals(sor[j]))
			   {
				   if(arr[j].equals("null"))
					continue;
				
				   System.out.print(arr[j]+" ");
				   arr[j]="null";
			   }
			}
			
		   if(arr[i].equals("null"))
		      continue;
		  
		   System.out.print(arr[i]+" ");
	       System.out.println();
	   }
   }
   
   public static String sort(String s){
	    char arr[]=s.toCharArray();
        int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		String str=new String();
		String string = str.copyValueOf(arr); 
		return string;
   }
}