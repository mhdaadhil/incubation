import java.util.Scanner;
public class Tnt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String str=sc.next();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		dorec(0,"",arr);
	}
	public static void dorec(int index,String temp,int arr[]){
		if(index==arr.length)
		{
			System.out.println(temp);
			return;
		}
		dorec(index+1,temp+arr[index],arr);
		dorec(index+1,temp,arr);
	}
}