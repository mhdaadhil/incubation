public class Tl2q3{
	public static void main(String []args){
		
		Employee e1= new Employee("Robert",1994,"64C- WallsStreat");
		System.out.println(e1.name+" "+e1.yoj+" "+e1.adress);
		
		Employee e2= new Employee("Sam",2000,"68D- WallsStreat");
		System.out.println(e2.name+" "+e2.yoj+" "+e2.adress);
		
		Employee e3= new Employee("John ",1999,"26B- WallsStreat");
		System.out.println(e3.name+" "+e3.yoj+" "+e3.adress);
		
	}
}
class Employee{
	String name;
	int yoj;
	String adress;
	public Employee(String name,int yoj,String adress){
		this.name=name;
		this.yoj=yoj;
		this.adress=adress;
		
	}
}