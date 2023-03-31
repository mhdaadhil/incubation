import java.util.Scanner;
public class Str2{
    public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int arr[]=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=-1;
		}
		
		int count=0;
		for(int i=0;i<s.length();i++){
			count =1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					arr[j]=0;
				}
			}
			if(arr[i]!=0)
			{
				arr[i]=count;
			}
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(arr[i]!=0)
				System.out.print(s.charAt(i)+""+arr[i]+" ");
		}
		
			
		
		
	}
}