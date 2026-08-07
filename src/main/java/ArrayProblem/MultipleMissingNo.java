package ArrayProblem;

public class MultipleMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,7,9,10};
		int n=10;
		for(int i=1; i<=n; i++) {
			boolean found = false;

			for(int j=0; j<arr.length; j++) {
				if(arr[j]==i) {
				found = true;
				break;
				}
			}
			
			if(!found) {
				System.out.println("Missing number are: "+ i);
			}
		}
		
	}

}
