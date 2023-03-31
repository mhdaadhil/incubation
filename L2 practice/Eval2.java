import java.util.Scanner;
public class Eval2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		char arr[]=str.toCharArray();
		int spl=0;
	    int num=0;
	    int low =0;
	    int cap=0;
		
		 for (int i=0;i<str.length();++i)
    	    {
    	    	if (arr[i]>=33 && arr[i]<=47 || arr[i]== 64)
    	    		spl++;
    	    	if (arr[i]>=46 && arr[i]<=57)
    	    		num++;
    	    	if (arr[i]>=65 && arr[i]<=90)
    	    		cap++;
    	    	if (arr[i]>=97 && arr[i]<=122)
    	    		low++;
    	    }
			
		System.out.println(spl+" "+num+" "+cap+" "+low);
		if(str.length()<8)
			System.out.println("weak");
		else if(str.length()>8&&cap>=1 &&spl==0&&num==0)
				System.out.println("medium");
		
		else if(str.length()>8&&cap>=1&&num>=1&&spl==0)
			System.out.println("good");
	
		else if(str.length()>8&&cap>=1&&num>=1&&spl>=1)
	       System.out.println("strong");
	}
	
}