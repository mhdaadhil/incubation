import java.util.Scanner;
public class Stringdemo1{
public static void main(String[] args ){

Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
char a[]=str.toCharArray();

for (int i=str.length()-1;i>=0;i--)
{
System.out.print(a[i]);
}
}
}

