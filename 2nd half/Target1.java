import java.util.Scanner;
public class Target1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the target");
		int target=sc.nextInt();
		
		System.out.println("enter the size of the elment ");
		int n=sc.nextInt();
		
		int total=0;
		int arr[]= new int [n];
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			int flag1=0; 
			for (int j=i+1;j<n;j++)
			{
				int flag2=0;
				for (int k=i+1;k<n;k++)
				{
					 if (arr[i]+arr[j]+arr[k]==target)
						{
							total=arr[i]+arr[j]+arr[k];
							System.out.println("Output: "+total);
							System.out.print(arr[i]+","+arr[j]+","+arr[k]);
							flag1=1;
							flag2=1;
							break;
						}
					 else if (arr[i]+arr[j]+arr[k]==target-1)
					{
						total=(arr[i]+arr[j]+arr[k]);
						System.out.print(arr[i]+","+arr[j]+","+arr[k]);
						System.out.println("Output: "+total);
						flag1=1;
						flag2=1;
						break;
					}
					else if (arr[i]+arr[j]+arr[k]==target+1)
					{
						total=(arr[i]+arr[j]+arr[k]);
						System.out.println("Output: "+total);
						System.out.print(arr[i]+","+arr[j]+","+arr[k]);
						flag1=1;
						flag2=1;
						break;
					}
					
				}
				if(flag2==1){
					break;
				}
			}

			if(flag1==1){
				break;
			}
		}
	}
	

}
