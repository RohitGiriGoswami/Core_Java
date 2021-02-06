package SortingAlgorithms;

public class BubbleSort1 {
	public static void main(String[] args) {
		int [] a= {30,20,50,20,60,70,40,11,32};
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		for(int q:a) {
			System.out.print(q+" ");
		}
	}

}
