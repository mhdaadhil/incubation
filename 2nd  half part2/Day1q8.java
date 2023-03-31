import java.util.Scanner;
public class Day1q8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word=sc.next();
		char arr[]=word.toCharArray();
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u'){
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}