import java.util.Scanner;

public class Railee{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = "mo";
		String password = "Aa";
		System.out.println("1.login");
		int n = sc.nextInt();
		if (n == 1) {
			Reservation rev = new Reservation();
			rev.login(username, password);
		}
	}
}
class Reservation {
	static int lower =2;
	static int middle =2;
	static int upper =2;
	static int rac =2;
	static int wl =2;
	static int b;
	static int k = 0;

	static int total = lower + middle + upper + rac + wl;
	Scanner sc = new Scanner(System.in);

	// int si[]=new int [50];
	String name[] = new String[12];
	String gender[] = new String[12];
	int age[] = new int[12];
	String berthpref[] = new String[12];
	int si[]=new int[12];

	public void login(String username, String password) {
		int a = 1;
		System.out.println(".....welcome to login page........");
		while (a != 0) {
			System.out.println("enter the username");
			String user = sc.nextLine();
			System.out.println("enter the password");
			String pass = sc.nextLine();
			if (pass.equals(password) && user.equals(username)) {
				a = 0;

			}
			if (a == 0)
				System.out.println(".......sucessfully loged in.........");
			else
				System.out
						.println(".......invalid username or password tryagain .........");
		}
		home();

	}

	public void home() {
		System.out
				.println("1.avalability 2.bookticket 3.cancelticket 4.myticket 5.booked ticket");

		int a = sc.nextInt();
		switch (a) {
		case 1:
			avalability();
			break;
		case 2:
			bookticket();
			break;
		case 3:
			cancelticket();
			break;
		case 4:
			myticket();
			break;
		case 5:
			bookedticket();
			break;
			
		default:
			System.out.println("enter the correct number");
			break;

		}

	}

	public void avalability() {
		System.out.println("avalable lower berth : " + lower
				+ "\navalable middle berth : " + middle
				+ "\navalable upper berth : " + upper
				+ "\navalable wl berth : " + wl
				+ ".................................");
		home();

	}

	public void bookticket() {
		System.out.println("..........how many tickets you want to book..........");
		b = sc.nextInt();
		if (total > 0) {
			if (lower > 0 || upper > 0 || middle > 0 || rac > 0) {
				for (int i = 0; i < b; i++, k++) {
					if (wl==0)
						{
						System.out.println("ticket gali bro");
						break;
						}
					si[k]+=si[k];
					System.out.println("name ");
					name[k] = sc.nextLine();
					name[k] = sc.nextLine();
					System.out.println("gender");
					gender[k] = sc.next();
					System.out.println("age");
					age[k] = sc.nextInt();
					System.out.println("berth preference");

					if (lower <= 0 && upper <= 0 && middle <= 0 && rac <= 0) {
						berthpref[k] = "W L";
						wl--;
					} else if (lower <= 0 && upper <= 0 && middle <= 0) {
						berthpref[k] = "RAC";
						rac--;
					} else if (age[k] <= 5) {
						berthpref[k] = "-------";
						continue;
					} else if (age[k] >= 60) {
					 if (lower == 0)
							berthpre();
					 else if (lower != 0)
							lower--;
						
					} 
					else
						berthpre();
				}
				home();
			} else {
				System.out.println("ticket is sold out");
				home();
			}
		} else {
			System.out.println("no ticket");
			home();
		}
	}

	public void cancelticket() 
	{
       for(int i=0;i<k;i++)
       {
    	   
       }
	}
	public void bookedticket(){
		
		int senoo = 0;
		System.out.println("si.no\t\t name\t\tgender\t\tage\t\t berth status\t\t seat no \t\t.");
		for (int i = 0; i <k;i++)
		{
			
		    ++senoo;
		    System.out.println(si[k]+"\t\t" + name[k] + "\t\t" + gender[k]+ "\t\t" + age[k] + "\t\t" + berthpref[k] + "\t\t\t" + senoo+"\t\t");
		    System.out.println("..........................................");
			home();
		}
	}

	public void myticket() {
		int seno = 0;

		System.out.println("si.no\t\t name\t\tgender\t\tage\t\t berth status\t\t seat no \t\t.");
		for (int i = 0; i <b; i++) {
			
			++seno;
			if(name[i]!=null)
			System.out.println(si[i] + "\t\t" + name[i] + "\t\t" + gender[i]
					+ "\t\t" + age[i] + "\t\t" + berthpref[i] + "\t\t\t" + seno
					+ "\t\t");
		}
		System.out.println("..........................................");
		home();

	}

	public void berthpre() {
		System.out.println("1.lower\n2.middle \n3.upper");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			lower();
			break;
		case 2:
			middle();
			break;
		case 3:
			upper();
			break;
		}

	}

	public void lower() {
		if (lower <= 0) {
			System.out.println("Lower berth is booked try other berth");
			berthpre();
		} 
		else{
			berthpref[k] = "Lower";
				lower--;
		}
	}

	public void middle() {
		if (middle <= 0) {
			System.out.println("middle berth is booked try other berth");
			berthpre();
		} else{
			berthpref[k] = "middle";
		middle--;
		}
		}

	public void upper() {
		if (upper <= 0) {
			System.out.println("upper berth is booked try other berth");
			berthpre();
		} else
		{	berthpref[k] = "upper";
		upper--;
		}
	}
}