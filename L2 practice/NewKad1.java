import java.util.Scanner;
public class NewKad1{
   public static void main(String[]args){
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter the size");
	   int n=sc.nextInt();
	   int arr[]=new int[n];
	   System.out.println("enter the element");
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   int maxsofar=arr[0];
	   int maxend=0;
	   String temp="";
	   int count=0;
	   for(int i=0;i<n;i++)
	   {
		   maxend=maxend+arr[i];
		     temp+=arr[i]+" ";
			 count++;
			 
		   if(maxsofar<maxend){
			   maxsofar=maxend;
			 
		   }
		   if(maxend<0){
			  maxend=0;
			  temp="";
			  count=0;
			   
		   }
	   }
	   System.out.println(maxsofar);
	   System.out.println(temp);
	   System.out.println(count);
   }
}