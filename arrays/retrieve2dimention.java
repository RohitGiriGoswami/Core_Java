package arrays;

public class retrieve2dimention {
	public static void main(String[] args) {
		
		int[][] r= {{10,20,30}, {40,50,60,70}};
		
		for(int i=0; i<r.length; i++) {
			
			for(int j=0; j<r[i].length;j++) {
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
			
		}
		for(int[] i:r) {
			
			for(int j:i) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

}
