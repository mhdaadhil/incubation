public class Inerherdem{
	public static void main(String[] args ){
		Child ch=new Child();
		
	}
}
class Parent{
	public void met(){
		System.out.println("this is child class ");
	}
}
class Child extends Parent{
	public void met(){
		System.out.println("this is child class ");
	}
}