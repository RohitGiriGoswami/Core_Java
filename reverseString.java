
public class reverseString {
	public static void main(String[] args) {
		
		String s="once upon a time in a mumbai";
		int n=s.length()-1;
	 String rev="";
		
		for(int i=n; i>=0; i--) {
		rev=rev+ s.charAt(i);	
		}
		System.out.print(rev);
		
	}

}
