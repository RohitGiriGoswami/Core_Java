package arrays;

import java.util.HashSet;

public class TwoArraysCommon2 {
	public static void main(String[] args) {
		int[] arr1= {4,3,7,9,2,4,4,4,4,5,5,5,76,8,6,46,84,66,75,};
		int[] arr2= {5,1,4,8,3,5,43,756,3,5,8,9,8,6,4,2,4,568,9,8,6};
		
	/*	HashSet<Integer> hs1=new HashSet<>();
		for(int no:arr1) {
			hs1.add(no);
		}
		for(int no:arr2) {
		boolean b=	hs1.add(no);
			if(b==false) {
				System.out.println(no);
			}
			
		} */
		
		
		HashSet<Integer> hs1=new HashSet<>();
		HashSet<Integer> hs2=new HashSet<>();
		
		for(int no:arr1) {
			hs1.add(no);
		}
		for(int no: arr2) {
			hs2.add(no);
		}
		for(int no:hs2) {
			    boolean b = hs1.add(no);
			    if(b==false) {
			    	System.out.print(no+" ");
			    }
		}
	}
	

}
