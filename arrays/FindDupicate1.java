package arrays;

public class FindDupicate1 {
	public static void main(String[] args) {
		
		int[] a= {20,30,20,30,10,40,604,350,205,6,60,40,305,36,};
		System.out.print("duplicates are= ");
		for(int i=0; i<a.length-1; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				if(a[j]==a[i] && i!=j) {
					System.out.print(a[j]+" ");
				}
				
			}
		}
	}

}
