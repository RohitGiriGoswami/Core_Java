package arrays;

public class secondLargestnumber {
	public static void main(String[] args) {
		int temp;
		int[] a= {30,20,40,90,60,50,10,80,20,11,44,55,23,76,24,76,35};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			if(i==2) {
				break;
			}
		}
		for(int q:a) {
			System.out.print(q+" ");
		}
		System.out.println();
		System.out.print("second largest element="+a[1]);
		
	}

}
