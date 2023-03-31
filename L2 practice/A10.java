zoimport java.util.Scanner;
public class A10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int j=s.length()-1;
		int i=0;
		String temp="";
	  for(;i<s.length()||j>=0;){
		  
		  if(s.charAt(j)>=32&&s.charAt(j)<=47||s.charAt(j)>=58&&s.charAt(j)<=64){
             temp=s.charAt(j)+temp;
			 j--;
		  }	
          else if(s.charAt(i)>=32&&s.charAt(i)<=47||s.charAt(i)>=58&&s.charAt(i)<=64){
			   i++;
			   continue;
		   }
	      else
		    {
			  temp=s.charAt(i)+temp;
			  i++;
			  j--;		   
		    }
		
	}
	System.out.println(temp);
}
}