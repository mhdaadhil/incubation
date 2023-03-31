import java.util.Scanner;
public class Solq2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("how many elements you want to enter");
		int n=sc.nextInt();
		int posnum=0,negnum =0,oddnum=0,evennum=0,zero=0;
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
	        arr[i]=sc.nextInt();			
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			  posnum++;
		  
		    if(arr[i]<0)
			  negnum++;
		  
		    if(arr[i]%2==0)
			  evennum++;
		    
			if(arr[i]%2!=0)
			  oddnum++;
		    
			if(arr[i]==0)
			  zero++;
		}
		System.out.println("positive numbers : "+posnum+"\nnegative numbers : "+negnum+"\nodd numbers: "+oddnum+"\neven numbers : "+evennum+"\nnumber of 0s : "+zero);
	}
}