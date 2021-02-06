package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate2 {
	public static void main(String[] args) {
		System.out.print("duplicates are= ");
		int[] a= {3,5,4,3,2,2,1,3,2,10};
		
		Set<Integer> s=new <Integer>HashSet();
		for(int q:a) {
			boolean b=s.add(q);
			//if(s.add(q)==false) {
			if(b==false) {
				System.out.print(q+" ");
			}
		
		
	}
		System.out.println();
		System.out.print(s+"  ");
	}

}
