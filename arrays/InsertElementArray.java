package arrays;

public class InsertElementArray {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6};
		
		int pos=3;
		int element=100;
		
		for(int i=a.length-1; i>pos-1; i--) {
			a[i]=a[i-1];
		}
		a[pos-1]=element;
	
		for(int q:a) {
			System.out.print(q+" ");
		}
	}

}
