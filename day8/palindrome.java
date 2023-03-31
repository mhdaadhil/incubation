import java.util.Scanner;
public class Palindrome{
public static void main(String[] args)
{
int flag=0;
Scanner sc = new Scanner(System.in);
String str= sc.next();
char arr[]=str.toCharArray();

       for (int i=0;i<arr.length;i++)
       {
         if (arr[i]!=arr[i-1])
           flag =1;
           break;
        }
        
if (flag==1)
System.out.println("it is not a palandrome");

else
System.out.println("it is a palamdrome");
}
}