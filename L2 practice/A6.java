import java.util.Scanner;

public class A6{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=0,b=0,c=1;
	System.out.println("enter the size");
	int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    	arr[i]=sc.nextInt();
    
    int max=arr[0];
    for(int i=0;i<n;i++)
    {
    	if(arr[i]>max)
    		max=arr[i];
    }
   // System.out.println(max);
	for(int i=0;i<n;i++){
		for(int j=0;j<max;j++)
		{
			a=b;
			b=c;
			c=a+b;
			if(a==arr[i]){
			System.out.println(arr[i]);
			break;
			}
		}
		 a=0;
		 b=0;
		 c=1;
	}
   
}
}