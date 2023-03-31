import java.util.Scanner;
public class RecRev{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String s=sc.nextLine();
		String rev="";
		String word="";
		s+=" ";
		String reverse= reve(s,rev,word,0);
		System.out.println(reverse);
	}
   public static String reve(String s,String rev,String word,int i){
	   
	   if(i==s.length())
		   return rev;
	   
	   char c= s.charAt(i);
	   if(c!=32)
        return reve(s,rev,word+c,i+1);
	  else 
		 return reve(s,word+" "+rev,"",i+1); 
   }	
}