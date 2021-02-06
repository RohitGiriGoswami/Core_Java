package SortingAlgorithms;

public class QuickSort1 {
	public static void main(String[] args) {
		
		int[] a= {43,65,25,86,46,96,356,85,2345,754,36,86,345,24,87,25};
		int leng=a.length;
		
		QuickSort1 q=new QuickSort1();
		q.quickSortRecursion(a,0,leng-1);
	}
	int partition(int[] a, int low,int high) {
		int pivote=a[(low+high)/2];
		while(low<=high) {
			
		}
	}

}
