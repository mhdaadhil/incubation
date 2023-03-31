import java.util.Scanner;
public class A1{
 public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
	 String s=sc.nextLine();
	 String word="";
	 String rev="";
	 String reverse=rever(s,rev,word,0);
	 System.out.println(reverse);
	 
 }
 public static String rever(String s,String rev,String word,int i){
	 if(i==s.length())
	 {
		 rev=word+" "+rev;
		 return rev;
	 }
	 char c =s.charAt(i);
	 if(c!=32)
	  return rever(s,rev,word+c,i+1);
    else
		return rever(s,word+" "+rev,"",i+1);
  
 }
}