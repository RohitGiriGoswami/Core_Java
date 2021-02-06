package arrays;

public class insertionSort {
	public static void main(String[] args) {
		int temp,j;
		int [] a= {40,30,50,1,0,30,20,50,204,50,2,04,50523,45,043,0};
		
		for(int i=1; i<a.length; i++) {
			temp =a[i];
			j=i;
			while(j>0 && a[j-1]>temp) {
				
				a[j]=a[j-1];
				j=j-1;
			
			}
			a[j]=temp;
			
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
