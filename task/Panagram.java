import java .util.*;

public class Panagram
{
public static void main(String [] args )
{
Scanner sc = new Scanner (System.in);
String str=sc.next();
int arr[]=new int[26];

for(int i =0;i<str.length();i++)
{
   if (str.charAt(i)>='a'&& str.charAt(i)<='z')
   {

    arr[str.charAt(i)-'a']++ ; 
}
  else if (str.charAt(i)>='A'&& str.charAt(i)<='Z')
   {

    arr[str.charAt(i)-'A']++ ; 
}

}
for (int i=0;i<26;i++)
{
if (arr[i]==0)
{
System.out.println("not a pangram");
return;
}

}
System.out.println("pangram");
sc.close();
}
}