package arrays;

public class bubbleSort {
	public static void main(String[] args) {
		int [] a= {36, 55,89,44,76, 90,1,2,3,43};
		System.out.println(a.length);
		int temp;
		for(int i=0; i<a.length; i++) {
			int flag=0;
			for(int j=0; j<a.length-1-i; j++) {
				
				if(a[j]<a[j+1]) {
					temp=a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
					flag=1;
					}
			}
			if(flag==0) {
				break;
			}
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
