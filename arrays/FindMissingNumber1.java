package arrays;

public class FindMissingNumber1 {
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,6};
		int expectNoElement=a.length+1;
		int totalSum=(expectNoElement*(expectNoElement+1))/2;
		//System.out.println(sum);
		int sum=0;
		for(int i=0; i<a.length; i++) {
			
			sum=sum+a[i];
			
			}
		System.out.println("missing number is=" +(totalSum-sum));
		}

}
