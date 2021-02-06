package arrays;

public class FindMissingNumber2 {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,6};
		int x1=a[0];
		for(int i=1; i<a.length; i++) {
			x1=x1^a[i];
		}
		int x2=1;
		for(int j=2; j<=6; j++) {
			x2=x2^j;
			
		}
		System.out.println(x1^x2);
	}

}
