import java.util.Scanner;
class TakeNotTake
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=scan.next();
		System.out.println("enter the subString");
		String b=scan.next();
		
		System.out.println(subSeq(a,"",b,0));
	
	}
	public static int subSeq(String up,String p,String b,int count)
	{
		if(up.length()==0)
		{
			if(p.equals(b)){
				count++;
			System.out.println(p);
			}
			
		    return count;
		}
		
		char c=up.charAt(0);
		return subSeq(sub(up),p+c,b,count)+subSeq(sub(up),p,b,count);
		
		
	}
	public static String sub(String s)
	{
		String temp="";
		for(int i=1;i<s.length();i++)
		temp+=s.charAt(i);
	return temp;
	}
}