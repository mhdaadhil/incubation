import java.util.Scanner;
import java.util.ArrayList;

public class Subset{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		seq(str,0,new ArrayList());
	}
	@SuppressWarnings("unchecked")
	public static void seq(String str,int index,ArrayList list){
		if(index==str.length()){
			System.out.println(list);
			return ;
		}
		list.add(str.charAt(index));
		seq(str,index+1,list);
		list.remove(list.size()-1);
	    seq(str,index+1,list);
		
	}
}