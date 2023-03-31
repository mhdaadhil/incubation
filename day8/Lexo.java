import java.util.Scanner;
public class Lexo{
public static void main(String [] args ){
Scanner sc = new Scanner(System.in);
 String str = sc.next();
char arr[]= str.toCharArray();
String str2=" ";

for (int i=0;i<arr.length;++i)
{
  for (int j=i+1;j<arr.length;++j)
   {
   if (arr[i]==arr[j])
       continue;
   else 
    str2=arr[i];
    }
}
System.out.print(str2);
}


}