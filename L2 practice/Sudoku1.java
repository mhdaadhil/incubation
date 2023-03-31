import java.util.Scanner;
public class Sudoku1{
 public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
	 char arr[][]=new char[9][9];
	 for(int i=0;i<9;i++)
	 {
		 for(int j=0;j<9;j++)
		 {
			 arr[i][j]=sc.next().charAt(0);
		 }
	 }
	 solution(arr);
 }
 public static void solution(char arr[][]){
	 if(backtrack(arr,0,0))
	 {
		 print(arr);
	 }
	 else 
		 System.out.println("no solution");
 }
 public static boolean backtrack(char arr[][],int r,int c){
	 if(r==9)
	 {
		 c++;
		 if(c==9)
		 {
			 return true;
		 }
		 r=0;
	 }
	 if(arr[r][c]!='.'){
		 return backtrack(arr,r+1,c);
	 }
	 for(int i=49;i<=57;i++)
	 {
		 if(solve(arr,r,c,i)){
			 arr[r][c]=(char)i;
			 if(backtrack(arr,r+1,c))
			 {
				 return true;
			 }
			 arr[r][c]='.';
		 }
	 }
	 return false;
 }
 public static boolean solve(char arr[][],int r,int c,int n){
	 int i=0,j=0;
	 for(i=0;i<9;i++)
	 {
		 if(arr[r][i]==n){
			 return false;
		 }
		 
	 }
	  for(i=0;i<9;i++)
	 {
		 if(arr[i][c]==n){
			 return false;
		 }
		 
	 }
	 int rindex=(r/3)*3;
	 int cindex=(c/3)*3;
	 for(i=0;i<3;i++)
	 {
		 for(j=0;j<3;j++)
		 {
			 if(arr[rindex+i][cindex+j]==n)
			 {
				 return false;
			 }
		 }
	 }
	 
	 
	 return true;
 }
 public static void print(char arr[][]){
	 for(int i=0;i<9;i++)
	 {
		 for (int j=0;j<9;j++)
		 {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
}
