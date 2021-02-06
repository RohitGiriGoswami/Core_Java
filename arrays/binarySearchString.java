package arrays;

public class binarySearchString {
	public static void main(String[]args) {
		
		String[] s= {"aaa", "bbb","ccc","ddd", "eee","fff","ggg","hhh"};
		
		String search="ccc";
		int lower=0;
		int higher= s.length-1;
		int min=(lower+higher)/2;
		
		if(s[min]==search) {
			System.out.println(" index number"+min);
		}
		else if(s[min].compareTo(search){
			
		}
	}

}
