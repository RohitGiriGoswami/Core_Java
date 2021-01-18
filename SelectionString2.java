
public class SelectionString2 {
	public static void main(String[] args) {
		
		String[] s= {"xxx", "qqq", "eee", "ttt", "yyy", "ppp", "ooo","mmm","nnn"};
		String temp;
		
		for(int i=0; i<s.length; i++) {
			int min=i;
			for(int j=i+1; j<s.length; j++) {
				
				if(s[j].compareTo(s[min])<0) {
					min=j;
				}
				
			}
			temp=s[i];
			s[i]=s[min];
			s[min]=temp;
		}
		for(String n:s) {
			System.out.print(n+" ");
		}
		
		
	}
}