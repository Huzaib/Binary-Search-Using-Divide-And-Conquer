package FirstProgram;

public class LinearSearch {
	
	public static int Search(int arr[], int u) {int k=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==u)k=i;
		}return k;
	}
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5,6,7,8,9,0};
		int k=8;
		System.out.println(Search(a,k));
		
	}

}
