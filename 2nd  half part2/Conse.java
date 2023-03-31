public class Conse{
	public static void  main(String[] args ){
		Scanner sc = new Scanner (System.in);
		String str =sc.next();
		String word = sc.next();
		String str2="";
		
		for (i=0;i<str.length();i++)
		{
			if (word.CharAt(i)>=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
			{
				if (word.CharAt(i)>=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
				{
					str2+=word.charAt(i);
					Str2+=word.charAt(i);
				}
				else
					continue;
			}
			else
				str+=word.charAt(i);
			}
		}
		System.out.println(str);
	}
}