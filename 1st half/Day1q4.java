import java.util.Scanner;
import java.util.Arrays;
public class Day1q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char str[]=sc.next().toCharArray();
		per(str,str.length);
	}
	public static void per(char str[],int r)
	{
		if (l==r)
		{
			System.out.println(Arrays.toString(str));
			return;
		}
		for (int i=0;i<=r;i++)
		{
			swap(str,i,l);
			per(str,l+1,r);
			swap(str,i,l);
		}
	}
	public static void swap(char str[],int j)
	{
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}
}