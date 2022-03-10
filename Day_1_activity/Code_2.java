import java.util.*;

public class Code_2 {
	public static boolean lastNameSame(String s1, String s2)
	{
		int a1=-1,a2=-1;
		String s3, s4;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isWhitespace(s1.charAt(i)))
			{
				a1=i;
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			if(Character.isWhitespace(s2.charAt(i)))
			{
				a2=i;
			}
		}
		s3=s1.substring(a1);
		s4=s2.substring(a2);
		if(s3.equalsIgnoreCase(s4))
		{
			return true;
		}
		else
		{
		    return false;
		}
	}

	public static void main(String[] as) {
		Scanner scanner=new Scanner(System.in);
		String name1,name2;
		System.out.println("Enter names:");
		name1=scanner.nextLine();
		name2=scanner.nextLine();
		if(lastNameSame(name1,name2)== true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}

