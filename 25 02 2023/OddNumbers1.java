import java.util.Scanner;
public class OddNumbers1{
 public static void main(String [] args){
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int m =sc.nextInt();
	 for(int i=n+1;i<m;i++)
	 {
		 if(i%2!=0)
		 {
			 System.out.print(i+" ");
		 }
	 }
	 
 }
}