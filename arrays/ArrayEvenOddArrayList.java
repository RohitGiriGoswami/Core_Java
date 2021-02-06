package arrays;

import java.util.ArrayList;

public class ArrayEvenOddArrayList {
	public static void main(String[] args) {
		int count=0;
		int oddCount=0;
		int[] a= {10,30,23,34,22,21,44,45,34,654,856,24,54,2567,5,567};
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				al1.add(a[i]);
			}
			else {
				al2.add(a[i]);
			}
		}
		System.out.print("Even numbers are=");
		for(int q:al1) {
			count++;
			System.out.print(q+" ");
		}
		System.out.println("total even number are"+ al1.size());
		System.out.println();
		System.out.print("odd numbers are=");
		for(int w:al2) {
			oddCount++;
			System.out.print(w+" ");
	}
		System.out.println("total even number are"+ al1.size());
		System.out.println();
		System.out.println("total even numbers is"+ count);
		System.out.println("total odd numbers is"+ oddCount);
	}
}
