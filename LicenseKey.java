
import java.util.*;

public class LicenseKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter string S  ");
		String s= sc.nextLine();
		System.out.println(" Enter integer K  ");
		int k= sc.nextInt();
		
		System.out.println(" The string s and integer k are "+s+" & "+k);
		
		s=s.trim();
		int len= s.length();
		
		int count=0;
		ArrayList<Character> op = new ArrayList<Character>();
		
		for(int i=len-1;i>=0;i--)
		{
			
			char c=Character.toUpperCase(s.charAt(i));
			if(c!='-'&&c!=' ') // ignore unwanted chars
			{
				
				if(count==k) //'-' after every kth char 
				{
					op.add('-');
					count=0;
				}
				count++;
				op.add(c);	
			}
		}
		
		for(int x =op.size()-1 ; x >= 0; x--) {   
		    System.out.print(op.get(x));
		}
		
	}

}
