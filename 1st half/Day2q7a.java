import java.util.Scanner;
public class Day2q7a{
    public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        String s ="";
		while (a>0)
		{
			char c=(char)((a-1)%26+'A');
			s=c+s;
			a=(a-1)/26;
		}
		System.out.println(s);
    }		
}