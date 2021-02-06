package SortingAlgorithms;

public class InsertionSort1 {
	public static void main(String[] args) {
		int temp;
		int j;
		int[] a= {50,30,70,20,60,21,68,567,25};
		for(int i=1; i<a.length; i++) {
			temp=a[i];
			j=i;
			while( j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int q:a) {
			System.out.print(q+" ");
		}
	}

}
