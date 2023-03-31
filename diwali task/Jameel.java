public class Jameel{
   public static void main(String[] args){
	   Rectangle rec1 = new Rectangle(4,5);
	 // rec1.area();
	   System.out.println(rec1.area());
	   Rectangle rec2 = new Rectangle(5,8);
	  // rec2.area();
	  System.out.println(rec2.area());
	   
   }
}
class Rectangle{
    int length;
	int breath;
	public Rectangle(int length,int breath){
		this.length=length;
		this.breath=breath;
	}
	public int area(){
		int area=length*breath;
		return area;
	}
}
