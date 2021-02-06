package arrays;

import java.util.HashSet;

public class LongestConsecutiveElement {
	public static void main(String[] args) {
		int a[]= {3,9,1,10,4,20,2,5,6};
		int longLeng=0;
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<a.length; i++) {
			hs.add(a[i]);
			
			}
		for(int i=0; i<a.length; i++) {
			if(! hs.contains(a[i]-1)) {
				int no=a[i];
				while(hs.contains(no)) {
					no++;
					
				}
				if(longLeng<no-a[i]) {
					longLeng=no-a[i];
					
					
				}
				
			}
		}
		System.out.println(longLeng);
		}

}
