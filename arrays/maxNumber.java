package arrays;

public class maxNumber {
	public static void main(String[] args) {
		
		int[] a= {10,20,30,50,60,80,40,20,120,70,30,50,80};
		
		int max=a[0];
		for(int i=1; i<=a.length-1; i++) {
			if(a[i]>max) {
				max=a[i];
			}
				
		}
		System.out.println("maxima is"+ max);
		
	}

}
