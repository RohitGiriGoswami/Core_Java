package arrays;

public class searching1 {
	public static void main(String[] args) {
		
		int[] a= {10,30,10,2,135,57,34,56,8,9,0,7,6,4,3,4,5,7,887,76,5,45,3,5,6,4,6,8};
		int target=44;
		int temp=0;
		for(int i=0; i<a.length; i++)
			if(a[i]==target) {
				System.out.println("target element is index number " +i);
				temp=1;
			}
		if(temp==0) {
			System.out.println("item is not matched");
		}
	}

}
