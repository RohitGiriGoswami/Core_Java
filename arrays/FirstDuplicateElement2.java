package arrays;

import java.util.HashSet;

public class FirstDuplicateElement2 {
	public static void main(String[] args) {
		
		int[] a= {5,6,3,2,1,2,4};
		HashSet <Integer> hs=new HashSet<>();
		int temp=-1;
		for(int i=a.length-1; i>=0; i--) {
			
			if(hs.contains(a[i])) {
				temp=i;
			}
			else
			{
				hs.add(a[i]);
			}
		}
		if(temp !=-1) {
			System.out.println("first duplicate us= " +a[temp]);
		}
		else
			System.out.print("no duplicate ");
	}

}
