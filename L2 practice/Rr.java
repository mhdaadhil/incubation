import java.util.Scanner;
public class Rr{
	public static void main(String []args){
		Booking b= new Booking();
		b.show();
	}
}
class Train{
	int l=1,m=1,u=1,rac=1,wl=1;
	Passanger[] pas=new Passanger[10];
	public void avalableSeat(){
		
		System.out.println("lower berth : "+l);
		System.out.println("middle berth : "+m);
		System.out.println("upper berth : "+u);
		System.out.println("RAC : "+rac);
		System.out.println("Waiting List : "+wl);
		
	
	}
	
	
}
class Passanger{
	String name;
	int age;
	String gender;
	String berthpref;
	int pnr;
	int seatno;
	public Passanger(String name,int age,String gender,String berthpref,int pnr,int seatno)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.berthpref=berthpref;
		this.pnr=pnr;
		this.seatno=seatno;
	}
	
	public String toString(){
		
		return name+"\t"+age+"\t"+"\t"+gender+"\t"+berthpref+"\t"+pnr+"\t"+seatno;
	}
	
}
class Booking extends Train{
	int k=0;
	int pnr=1000;
	int seatno=0;
	Scanner sc = new Scanner(System.in);
	
	public void show(){
		Cancel c = new Cancel();
	    boolean d=true;
		while(d) {

		System.out.println("1.BookTicket\n2.Avalable Ticket\n3.View Ticket\n4.Cancel Ticket\n............................");
		int n =sc.nextInt();
		switch(n){
			case 1:
			bookTicket();
			break;
			case 2:
			avalableSeat();
			break;
			case 3:
			viewTicket();
			break;
			case 4:
			c.cancelTicket();
			break;
		}
	}
	}
	
     public void bookTicket(){
		 System.out.println("enter how many passanger");
		 int n=sc.nextInt();
		 
		 for(int i=0;i<n;i++){
		 System.out.println("enter the name ");
		 String name=sc.next();
		 System.out.println("enter the age");
		 int age=sc.nextInt();
		 System.out.println("enter the gender");
		 String gender=sc.next();
		 String berthpref="";
		 if(l==0&&m==0&&u==0&&rac==0&&wl>0){
			 berthpref="wl";
			 wl--;
			 pas[k]=new Passanger(name,age,gender,berthpref,pnr,seatno);
			 k++;
		 }
		 else if(l==0&&m==0&&u==0&&rac>0){
			 berthpref="Rac";
			 rac--;
			  pas[k]=new Passanger(name,age,gender,berthpref,pnr,seatno);
			 k++;
		 }
		 else if(age>60)
		 {
			 if(l>0)
			 {
				 berthpref="L";
				 l--;
				 pas[k]=new Passanger(name,age,gender,berthpref,pnr,seatno);
			     k++;
			}
			else 
				berthpref=berthPref();
			    pas[k]=new Passanger(name,age,gender,berthpref,pnr,seatno);
			    k++;
		 }
		 else if(age<=5)
		 {
			 berthpref="----";
			 pas[k]=new Passanger(name,age,gender,berthpref,pnr,seatno);
			 k++;
		 }
		 else if(wl<=0){
			 System.out.println("no ticket is avalable");
			 break;
		 }
		 

		 else{
			 berthpref=berthPref();
			 pas[k]=new Passanger(name,age,gender,berthpref,pnr,seatno);
			 k++;
		 }
		 
	}
	 }
	 public String berthPref(){
		 System.out.println("enter the berth perference");
		 String berthh=sc.next();
		 if(berthh.equals("l"))
		 {
			 if(l<=0)
			 {
				 System.out.println("lower berth is not avalable");
				 return berthPref();
			 }
			 else{
				 l--;
				 return "l";
			 }
		 }
		 if(berthh.equals("m"))
		 {
			 if(m<=0)
			 {
				 System.out.println("middle berth is not avalable");
				 return berthPref();
			 }
			 else{
				 m--;
				 return "m";
			 }
		 }
		 if(berthh.equals("u"))
		 {
			 if(u<=0)
			 {
				 System.out.println("upper berth is not avalable");
				 return berthPref();
			 }
			 else{
				 u--;
				 return "u";
			 }
		 }
		 
		 return "ewe";
		 
		 
	 }
	 public void viewTicket(){
		 
		 System.out.println("name\tage\tgender\tberthperf\tpnr\tseatno");
		 for(int i=0;i<k;i++)
		 {
			 System.out.println(pas[i]+"");
		 }
		// show();
	 }
	 
}
class Cancel extends Train{
	public void cancelTicket(){
		
	}
}