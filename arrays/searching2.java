package arrays;

public class searching2 {
	public static void main(String[] args) {
		
		String[] s= {"xxx", "yyy", "zzz", "ooo","qqq", "fff", "ppp","aaa"};
		String search="XXX";
		int f=0;
		for(int i=0; i<s.length; i++) {
			if(s[i].equals(search)) {
				System.out.println("item is index number" +i);
				
				f++;
				}
			
			}
		if(f==0) {
			System.out.println("there is no match");
		}
	}

}
