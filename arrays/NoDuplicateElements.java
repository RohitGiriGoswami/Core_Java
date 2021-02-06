package arrays;

public class NoDuplicateElements {
	public static void main(String[] args) {
		
		int[] a= {5,4,3,4,5,3,2};
		System.out.println(a.length);
		int rev=a[0];
		for(int i=1; i<a.length;i++) {
			 rev=rev^a[i];			
			
		}
		System.out.println("single element are= " +rev);
	}

}
