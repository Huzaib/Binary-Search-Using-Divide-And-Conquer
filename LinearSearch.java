package FirstProgram;

public class LinearSearch {
	
	public static int Search(int arr[], int u, int low, int high) {int mid = low + (high-low)/2;
	if(arr[mid]==u)return mid;
	else if(u>arr[mid]) return Search(arr, u, mid+1, high);
	else return Search(arr, u, low, mid-1);
	}
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5,6,7,8,9,0};
		int k=8;
		System.out.println(Search(a,k, 0, 9));
		
	}

}
