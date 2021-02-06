package SortingAlgorithms;

public class BinarySearch1 {
	public static void main(String[] args) {
		
		int[] a= {40,30,20,60,70,21,23,43,56,76,35};
		int search=433;
		int item=0;
		int lower=0;
		int higher=a.length-1;
		int min=(lower+higher)/2;
		while(lower<=higher) {
			if(a[min]==search) {
				item++;
				System.out.println("your search result"+ min);
				break;
			}
			else if(a[min]<search) {
				lower=min+1;
			}else {
				higher=min-1;
			}
		
		min=(lower+higher)/2;
	}
		if(item==0) {
			System.out.println("not matched");
		}
	}
}
