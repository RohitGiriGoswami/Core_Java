package arrays;

public class fourthLargestNumber {
	public static void main(String[] args) {
		
		int[] a= {10,2,3923,324035,23,33,32,64
				,57,135,64,24,25,6,87,9,4,45};
		
		for(int i=0; i<a.length; i++) {
			int min=i;
			for(int j=i+1; j<a.length; j++ ) {
				if(a[j]<a[min]) {
					min=j;
				}
				
			}
		     int temp=a[i];
		     a[i]=a[min];
		     a[min]=temp;
		     
		}
		for(int q:a) {
			System.out.print(q+" ");
		}
		System.out.println();
		System.out.print("fourth greatest number=" +a[3]);
	}
	

}
