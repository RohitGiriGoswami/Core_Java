package arrays;

public class OneDimentional {
	public static void main(String[] args) {
		
	 int[] a;
	 a=new int[5];
	 System.out.println(a.length);
	 
	 a[0]=10;
	 a[1]= 20;
	 a[2]=30;
	 a[3]=40;
	 a[4]=50;
	 
	 System.out.println(a);
	 
	 
	/* for(int i=a.length-1; i>=0; i-- ) {
		 System.out.print(a[i]+" ");
	 } */
	 
	 for(int x:a) {
		 System.out.print(x);
	 }
	 
	 
	}

}
