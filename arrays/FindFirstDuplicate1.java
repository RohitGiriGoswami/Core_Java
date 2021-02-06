package arrays;

public class FindFirstDuplicate1 {
	public static void main(String[] args) {
		
		int[] a= {6,5,3,2,5,1,2,4};
		for(int i=0; i<a.length-1; i++) {
			int temp=0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.print("first duplicate = " +a[i]);
					temp++;
					break;
				}
			}
			if(temp>0) {
				break;
			}
		}
	}

}
