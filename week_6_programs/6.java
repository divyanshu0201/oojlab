import java.util.Scanner;

public class prog6{
	public static void main(String args[])
	{
		Scanner xx=new Scanner(System.in);
		String str;
		System.out.println("Enter the string : ");
		str=xx.nextLine();
		int vowels=0,consonants=0,space=0;
		int i=0;
		int l=str.length();
		char s;
		for(i=0;i<l;i++)
		{
			s=str.charAt(i);
			if((s>='a'&&s<='z')||(s>='A'&&s<='Z'))
			{
				if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else if(s==' ')
			{
				space++;
			}
		}
		System.out.println("The number of vowels are : "+vowels);
		System.out.println("The number of consonants are : "+consonants);
		System.out.println("The number of space are ; "+space);
	}
}
