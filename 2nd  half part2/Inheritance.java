import java.util.Scanner;
public class Inheritance{
	public static void main(String [] args){
		RectangleArea rec = new RectangleArea();
		rec.readinput();
		
	}
}
class Rectangle{
	int height;
	int width;
	public void display(int height, int width){
		System.out.println(height+" "+width);
	}
}
class RectangleArea extends Rectangle{
	Scanner sc = new Scanner(System.in);
	public void readinput(){
	     System.out.println("enter the height and width");
		 height=sc.nextInt();
		 width=sc.nextInt();
		 super.display(height,width);
		  display(width*height);
	}
	public void display(int area)
	{
		System.out.println(area);
	}
	
} 