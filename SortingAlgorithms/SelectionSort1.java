package SortingAlgorithms;

public class SelectionSort1 {
	public static void main(String[] args) {
		
		int[] a= {30,20,50,70,60,30,20,10};
		int min;
		for(int i=0; i<a.length; i++) {
			min=i;
			int temp;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int q:a) {
			System.out.print(q+ " ");
		}
	}

}
