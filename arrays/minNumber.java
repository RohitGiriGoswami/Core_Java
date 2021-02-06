package arrays;

public class minNumber {
	public static void main(String[] args) {
		
		int[] a= {10,20,01,3,50,30,40,5,30,20,0200,01,11,};
		
		int min=a[0];
		for(int i=1; i<=a.length-1; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("minimum number is==" +min);
	}

}
