import java.util.Scanner;
public class Twistedprime1 {
public static void main(String[] args) {

int flag=0;
int primenumber=0;
int reverse=0;

Scanner sc= new Scanner (System.in);

System.out.println("enter the number");
int usernum = sc.nextInt();

if (usernum ==0||usernum ==1)
{
flag =1;
}

for (int i=2;i<usernum;++i)
{
if (usernum%i==0)
{
flag=1;
}
}

if (flag==0)
{
System.out.println("the number you entered is prime ");
primenumber++;
}
else 
{
System.out.println("the number you entered is not a prime number");
}


if (primenumber==1)
{
while (usernum!=0)
{
int rem=usernum%10;
reverse = reverse*10+rem;
usernum/=10;
}

if (reverse ==0||reverse==1)
{
flag=1;
}
for(int i=2;i<reverse/2;++i)			{
if (reverse%i==0)
flag=1;
}
if (flag==0)
{
System.out.println(reverse+" is a twisted prime number ");
}
else 
{
System.out.println(reverse+" is not a twisted prime number ");
}
}
}
}
