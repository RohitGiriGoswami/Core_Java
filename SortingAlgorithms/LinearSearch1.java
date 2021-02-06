package SortingAlgorithms;

public class LinearSearch1 {
	public static void main(String[] args) {
		
		int[]a= {10,40,20,50,20,60,8};
		
		int number=50;
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]==number) {
				System.out.println(i+" index number is");
			}
		}
		
	}

}
