import java.util.Scanner;
public class Vowels{
	public static void main(String[]args )
	{
	   Scanner sc = new Scanner (System.in);
         String str= sc.next();
		 char arr[]=str.toCharArray();
		 for (int i=0;i<arr.length-1;i++)
		 {
			 for (int j=i+1;j<n;j++)
			 {
				 if(arr[i]==arr[i+1])
			 {
				break;
                 //System.out.print(arr[i+1]);			
			 }
			    
			else if (arr[i]==97||arr[i]==101||arr[i]==105||arr[i]==111||arr[i]==117)
				continue;
				
			 
			 else 
				 System.out.print(arr[i]);
			 }
			 
			 
		 }
		 
	}
	}