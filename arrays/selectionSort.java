package arrays;

public class selectionSort {
	public static void main(String[] args) {
		
		int[] a= {20,30,10,50,40,60,90,100,5,0,19,6};
		int min; int temp;
		for(int i=0; i<a.length; i++) {
			min=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]< a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			
		}
		for(int q:a) {
			System.out.print(q+" ");
		}
	}

}
