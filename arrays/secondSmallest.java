package arrays;

public class secondSmallest {
	public static void main(String[] args) {
		
		int[] a= {32,45,265,35,7,46,24,35,477,31,4,6,13,467,24,56,366,6,2,6,3,6,964,};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[i]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==1) {
				break;
			}
			
		}
		for(int q:a) {
			System.out.print(q+" ");
		}
		System.out.println();
		System.out.println("second samllest number="+a[1]);
	}

}
