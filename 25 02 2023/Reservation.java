import java.util.*;
public class Reservation
{
static int lower=1,upper=1,middle=1,rac=1,waiting=1,for_wait=0,for_rac=0,q1=0,q2=0,m=0;
static int Rac[]=new int[3];
static int Waiting[]=new int[3];
static int n=0;

static class Passenger
{
String name,status;
int age,pnr,berth_no;
char berth;
			public void check(char be)
				 {
				  m++;
				 if(lower==0 && upper==0 && middle==0 && rac==0 && waiting==0) {
					 System.out.println("All Tickets are Booked.....");
					 n--;
				 }
				 else {
					 if (be == 'l' && lower > 0) {
						 berth=be;
						 System.out.println("Lower Berth is Booked....");
						 lower--;
						 status="Confirm";
					 } else if ((be == 'm' && middle >0) || (be == 'l' && middle>0) || (be=='u' && upper<=0)) {
						 berth='m';
						 System.out.println("Middle Berth is Booked....");
						 middle--;
						 status="Confirm";
					 } else if ((be == 'u' && upper >0) || (be == 'm' && upper>0) || (be == 'l' && upper>0)) {
						 berth='u';
						 System.out.println("Upper Berth is Booked....");
						 upper--;
						 status="Confirm";
					 }
					 else if ((be == 'm' && rac>0) || (be == 'l' && rac>0) ||(be == 'u' && rac>0)) {
						 berth='R';
						 Rac[for_rac++] =m;
						 System.out.println("You are in RAC....");
						 rac--;
						 status="rac";
					 }
					 else {
						 berth='W';
						 Waiting[for_wait++] =m;
						 System.out.println("You are waiting list....");
						 waiting--;
						 status="wait";
					 }
					 System.out.println("Booked Successfully.........!");
				 }
				 }
};
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Passenger pass[]=new Passenger[10];
int c,z=8;
		do{
			System.out.println();
			System.out.println("1.Book the Tickets : \n2.Display with PNR : \n3.Cancel Tickets : \n4.Add Cabin \n5.Add Coach \n0.Exit \nEnter your Option :");
			c=sc.nextInt();
			switch(c)
			{
			case 1:
			  System.out.println("Enter No of Tickets :");
			  int y=sc.nextInt(),pnr=4000*z;
			  if(y<=waiting+lower+upper+middle+rac)
			  {
			  while(y>0)
			  {
			  n++;
			  pass[n]=new Passenger();
			  pass[n].berth_no=n;
			  pass[n].pnr=pnr;
			  System.out.println();
			   System.out.println("Enter the Name :");
			   pass[n].name=sc.next();
			   System.out.println("Enter the age :");
			   int age=sc.nextInt();
			   if(age<6)
			   {
				  System.out.println("Above Age Five Only...."); 
				  continue;
			   }
			   else
				  pass[n].age=age;
			  
			   System.out.println("Enter the Berth :");
			   char berth=sc.next().charAt(0);
			   pass[n].check(berth);
			   System.out.println();
			   System.out.println("Your PNR is :"+pass[n].pnr);
			   y--;
			   }
			   
			   z++;
			  }
			  else
			     System.out.println("Available Tickets :"+(waiting+lower+upper+middle+rac));
			   break;
			 case 2:
				System.out.println("Enter the PNR Number :");
				int check_pnr=sc.nextInt(),id1=-1;
				for(int i=1;i<=n;i++)
				{
					if(pass[i].pnr==check_pnr)
					{
						System.out.println("Name \tAge \tStatus \tBerth Number \tBerth");
						System.out.println(pass[i].name+"      "+pass[i].age+"      "+pass[i].status+"       "+pass[i].berth_no+"          "+pass[i].berth);
						System.out.println("----------------------------------------------------------------");

						id1=i;
					}
				}
				if(id1==-1)
					System.out.println("PNR Number Not Found");
				break;
			case 3:
			  System.out.println();
				System.out.println("Enter the Name :");
				String check_name=sc.next();
				int id2=-1;
				for(int i=1;i<=n;i++)
				{
					if(check_name.equals(pass[i].name))
					{
						if(Waiting.length>0)
						{
						pass[Waiting[q1]].berth=pass[Rac[q2]].berth;
						pass[Waiting[q1]].status="rac";
						pass[Rac[q2]].berth=pass[i].berth;
						pass[Rac[q2]].status="Confirm";
						pass[i].berth_no=-1;
						q1++;
						q2++;
						waiting++;
						
						}
						else if(Rac.length>0)
						{
						pass[Rac[q2]].berth=pass[i].berth;
						pass[Rac[q2]].status="Confirm";
						pass[i].berth_no=-1;
						q2++;
						rac++;
						}
						else
						{
						pass[i].berth_no=-1;
						}
						id2=i;
						break;
					}
				}
				if(id2==-1)
					System.out.println("Name Not Found");
				else
				{
				for(int i=1;i<=n;i++)
				{
					if(pass[i].berth_no!=-1)
					{
						System.out.println("PNR  \tName  \tAge  \tStatus  \tBerth Number  \tBerth");
						System.out.println(pass[i].pnr+"    "+pass[i].name+"    "+pass[i].age+"         "+pass[i].status+"          "+pass[i].berth_no+"      "+pass[i].berth);
				       System.out.println("----------------------------------------------------------------");
					}
				}
				}
				break;
			case 4:
			  System.out.println();
				System.out.println("Cabin Added Successfully....");
				lower++;upper++;middle++;rac++;waiting++;
				for(int i=1;i<=n;i++)
				{
					if(pass[i].berth=='R')
					{
						if(lower>0)
						{
						pass[i].berth='l';
						lower--;
						pass[i].status="Confirm";
						}
						else if(middle>0)
						{
						pass[i].berth='m';
						middle--;
						pass[i].status="Confirm";
						}
						else
						{
						pass[i].berth='u';
						upper--;
						pass[i].status="Confirm";
						}
						rac++;
					}
				}
				for(int i=1;i<=n;i++)
				{
					if(pass[i].berth=='W')
					{
						if(lower>0)
						{
						pass[i].berth='l';
						lower--;
						pass[i].status="Confirm";
						}
						else if(middle>0)
						{
						pass[i].berth='m';
						middle--;
						pass[i].status="Confirm";
						}
						else if(upper>0)
						{
						pass[i].berth='u';
						upper--;
						pass[i].status="Confirm";
						}
						else
						{
							pass[i].berth='R';
						   rac--;
						   pass[i].status="rac";
						}
						waiting++;
							
					}
				}
				for(int i=1;i<=n;i++)
				{
					if(pass[i].berth_no!=-1)
					{
						System.out.println("PNR  \tName  \tAge  \tStatus  \tBerth Number  \tBerth");
						System.out.println(pass[i].pnr+"    "+pass[i].name+"    "+pass[i].age+"   "+pass[i].status+"       "+pass[i].berth_no+"         "+pass[i].berth);
				       System.out.println("----------------------------------------------------------------");
					}
				}
				break;
			case 5:
			System.out.println();
			  System.out.println("Coach Added Successfully....");
				lower++;upper++;middle++;rac++;waiting++;
				for(int i=1;i<=n;i++)
				{
					if(pass[i].berth=='R')
					{
						if(lower>0)
						{
						pass[i].berth='l';
						//lower--;
						pass[i].status="Confirm";
						}
						else if(middle>0)
						{
						pass[i].berth='m';
						//middle--;
						pass[i].status="Confirm";
						}
						else
						{
						pass[i].berth='u';
						//upper--;
						pass[i].status="Confirm";
						}
					}
				}
				for(int i=1;i<=n;i++)
				{
					if(pass[i].berth=='W')
					{
						if(lower>0)
						{
						pass[i].berth='l';
						//lower--;
						pass[i].status="Confirm";
						}
						else if(middle>0)
						{
						pass[i].berth='m';
						//middle--;
						pass[i].status="Confirm";
						}
						else if(upper>0)
						{
						pass[i].berth='u';
						//upper--;
						pass[i].status="Confirm";
						}
						else
						{
							pass[i].berth='R';
						   //rac--;
						   pass[i].status="rac";
						}
							
					}
				}
				for(int i=1;i<=n;i++)
				{
					if(pass[i].berth_no!=-1)
					{
						System.out.println("PNR  \tName  \tAge  \tStatus  \tBerth Number  \tBerth");
						System.out.println(pass[i].pnr+"    "+pass[i].name+"    "+pass[i].age+"   "+pass[i].status+"       "+pass[i].berth_no+"         "+pass[i].berth);
				       System.out.println("----------------------------------------------------------------");
					}
				}
				System.out.println("---Available Seats---");
				System.out.println("Lower--->"+lower);
				System.out.println("Middle--->"+middle);
				System.out.println("Upper--->"+upper);
				System.out.println("RAC--->"+rac);
				System.out.println("Waiting--->"+waiting);
				System.out.println();
				break;
			}
		}while(c!=0);
}
}