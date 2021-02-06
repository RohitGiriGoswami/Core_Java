package arrays;

public class ArrayAllOddEven {
	public static void main(String[] args) {
		
		int[] a= {8,5,10,12,13,1,4 ,7};
		int add=0;
		int odd=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				add=add+a[i];
				System.out.print(a[i]+" ");
			}
			else
				odd=odd+a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println("even addition is=" +add);
		System.out.println("odd numberi additon is " + odd);
	}

}
