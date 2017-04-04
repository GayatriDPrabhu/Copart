import java.util.*;

public class StringtoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter input string S  ");
		String s= sc.nextLine();
		s=s.trim();
		int count=0;
		int num=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			int cur=s.charAt(i)-48; //convert to each char into int from its ascii code
			int fac=(int) Math.pow(10, count); //get the decimal place of that char's int-form
			num=num+(cur*fac);
			count++;
			
		}
		System.out.println(num);// num is an integer

	}

}
