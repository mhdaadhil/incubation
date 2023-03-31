import java.util.Scanner;
public class Matmul{
	public static void main(String args[])
	{
		int sum;
		Scanner sc = new Scanner(System.in);
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		int result[][]=new int[3][3];
		
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 mat1[i][j]=sc.nextInt();
		 }
		 //System.out.println();
	 }
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 mat2[i][j]=sc.nextInt();
	     }
	 }
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 sum=0;
			 for(int k=0;k<3;k++)
			 {
				 sum+=mat1[i][k]*mat2[k][j];
			 }
			 result[i][j]=sum;
		 }
		 
     }
	 
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 System.out.print(result[i][j]+" ");
		 }
		 System.out.println();
	 }
 
	 
		
		
		
	}
}