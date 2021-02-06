package arrays;

public class TwoDimen {
	public static void main(String[] args) {
	
		
		/*a[0][0]= 10;
		a[0][1]=50;
		System.out.println(a[0].length);
		a[0][2]=30;  */
		
		
		int[][] a= {{10,20,30},{40,50,60}};
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<=2; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
