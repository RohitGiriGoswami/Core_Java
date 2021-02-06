package arrays;

public class secondLargestPart2 {
	public static void main(String[] args) {
	int[] a= {10,30,50,30,10,70,40,20,4,60,20,50,120,70,3,0};
	int temp;
	int largest=Integer.MIN_VALUE;
	int SecondLargest=Integer.MIN_VALUE ;
	
	for(int i=0; i<a.length; i++) {
		if(a[i]>largest) {
			SecondLargest=largest;
			largest=a[i];
		}
		else {
			if(a[i]>SecondLargest && a[i]!=largest) {
				SecondLargest=a[i];
			}
		}
	}
	System.out.println(largest);
	System.out.println(SecondLargest);
	
	

}
}