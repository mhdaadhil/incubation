import java.util.Scanner;
public class Eval1{
    public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int arr[]=new int [26];
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				arr[s.charAt(i)-'a']=1;
			}
			else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
				arr[s.charAt(i)-'A']=1;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0){
				flag=false;
			    break;
			}
			
		}
		System.out.println(flag);
		
	}
}