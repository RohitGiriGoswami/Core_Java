package arrays;

public class retrieve3Dimention {
	public static void main(String[] args){
		
		int[][][] r= {{{10,20,30},{40,50},{60,70,80,90}}};
		System.out.println(r.length);
		for(int i=0; i<r.length; i++) {
			
			for(int j=0; j<r[i].length; j++) {
				
				for(int k=r[i][j].length -1; k>=0; k--) {
					System.out.print(r[i][j][k]+ " ");
				}
				System.out.println();
			}
			
		}
		
		for(int[][] i:r) {
			
			for(int[] j:i) {
				for(int k:j) {
					System.out.print(k);
				}
				System.out.println();
			}
			
		}
	}
	

}
