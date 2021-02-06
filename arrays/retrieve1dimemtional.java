package arrays;

public class retrieve1dimemtional {
	public static void main(String[] args) {
		
		int[] r= {10,20,30,40};
		System.out.println(r);
		
		for(int i=0; i<r.length; i++) {
			System.out.print(r[i]+ " ");
		}
		System.out.println();
		
		for(int a:r) {
			System.out.print(a+ " ");
		}
	
	}

}
