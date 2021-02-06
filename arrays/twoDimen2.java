package arrays;

public class twoDimen2 {
	public static void main(String[] args)
	{
	/*	int[][] a= new int[2][];
		a[0]=new int[3];
		a[0][0]= 10;
		
		a[1]=new int[2];
		
		System.out.println(a[0].length);
		System.out.println(a.length);
		System.out.println(a[1]);*/
		
		int[][] x= {{10,20,30},{40,50},{60,70,80,90}};
		System.out.println(x[1].length);
		System.out.println(x[0].length);
		System.out.println(x[2].length);
		System.out.println(x[0][0]);
		
		for(int i:x[0])
			System.out.print(i);
		
		
		for(int i=0; i<x.length; i++) {
			
			for(int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		
	}

}
