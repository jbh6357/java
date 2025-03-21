import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex00백준 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		String s = "A";//"BAAAAABAA";
//		
//		String t = "ABBA";//"BAABAAAAAB";
		
		String s = br.readLine();
        String t = br.readLine();

		
		boolean	result = isTrue(s,t);
		
		System.out.println(result ? 1 : 0);	
	}
	
	public static boolean isTrue(String s, String t)
	{
		
		for(int i=0; i<=t.length()-s.length(); i++)
		{
			if (s.equals(t.substring(i,i+s.length())))
			{
				String left = t.substring(0,i);
				String right = t.substring(i+s.length());
				if (cal(left, right, s, false))
				{
					return true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder(s);
		String reversed = sb.reverse().toString();
		
		if(!(reversed.equals(s))){
			for(int i=0; i<=t.length()-s.length(); i++)
			{
				if (reversed.equals(t.substring(i,i+s.length())))
				{
					String left = t.substring(0,i);
					String right = t.substring(i+s.length());
					if (cal(left, right, s, true))
					{
						return true;
					}
				}				
			}	
		}
		return false;			
	}
	
	public static boolean cal(String left, String right, String s, boolean isReversed)
	{
		int flag = 1;
		int cnt = 0;
		
		if(isReversed)
		{
			cnt++;
		}
		for(int i=0; i<1; i++)
		{
			if(flag==1)
			{
				if(left.startsWith("A"))
				{
					return false;
				}
				if(right.endsWith("A"))
				{
					right = right.substring(0,right.length()-1);
					i--;
					continue;
				}
				else if(right.endsWith("B") && left.startsWith("B"))
				{
					right = right.substring(0,right.length()-1);
					left = left.substring(1);
					i--;
					continue;
				}else if(left.startsWith("B"))
				{
					left = left.substring(1);
					flag *=-1;
					i--;
					cnt++;
					continue;
				}
			}else if(flag==-1)
			{
				if(right.endsWith("A"))
				{
					return false;
				}
				if(left.startsWith("A"))
				{
					left = left.substring(1);
					i--;
					continue;
				}
				else if(right.endsWith("B") && left.startsWith("B"))
				{	right = right.substring(0,right.length()-1);
					left = left.substring(1);
					i--;
					continue;
				}else if(right.endsWith("B"))
				{
					right = right.substring(0,right.length()-1);
					flag *= -1;
					i--;
					cnt++;
					continue;
				}	
				
			}
		}
		
		if(left.isEmpty()&&right.isEmpty())
		{
			
			if(cnt%2!=0)
			{
				StringBuilder sb = new StringBuilder(s);
				String reversed = sb.reverse().toString();
				
				if(s.equals(reversed))
				{
					return true;
				}
				
			}else{
				return true;				
			}		
			
		}
		
		return false;	
			
	}

}
