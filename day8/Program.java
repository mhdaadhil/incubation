import java.util.Scanner;
public class Program{
public static void main (String[] args){
Scanner sc = new Scanner (System.in);
String str= sc.next();
char arr[]=toCharArray();
int mid = arr.length/2,k=0;

       for (int i=mid ;i<arr.length;++i)
         {
             a[k++]=a[i];
          }

      for(int i=0;i<arr.length;++i)
         {
             a[k++]=arr[i];
          }
      for (int i=0;i<arr.lenght;i++)
         {
           a[k++]=arr[i];
        }
  for (int i=0;i<arr.length;++i)
     {
         k=0;
        for (int j=0;j<arr.length;j++)
           {
             if (j<arr.length-1)
            {
            System.out.println(" ");
            if (j>=arr.length-1)
            {
             System.out.println(a[k++]);
              }
          arr.length--;
         System.out.println();
}
}
}
}
}