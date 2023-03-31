import java.util.*;

public class Q4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		
		for(int i=0;i<9;i++){
		    for(int j=0;j<9;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		
		int count;
		
		for(int i=0;i<9;i++){
		    count=0;
		    for(int j=0;j<9;j++){
		        count=count+arr[i][j];
		    }
		    if(count!=45){
		        System.out.print("Sudoku is not correct");
		        System.exit(0);
		    }
		}
		
		for(int j=0;j<9;j++){
		    count=0;
		    for(int i=0;i<9;i++){
		        count=count+arr[i][j];
		    }
		    if(count!=45){
		        System.out.print("Sudoku is not correct");
		        System.exit(0);
		    }
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				count=0;
				for(int k=0;k<3;k++)
				{
					for(int l=0;l<3;l++)
					count=count+arr[i*3+k][j*3+l];
				}
				
				if(count!=45)
				{
					System.out.print("Sudoku is not correct");
		            System.exit(0);
				}
			}
			
			
		}
	}
}