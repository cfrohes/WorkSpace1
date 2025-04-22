package p1;

public class Cogni {
	public static void main(String[] args) {
		int n = 8;
		int arr[] = {11, 1, 2, 8, 10, 11, 15, 7};
		int res[] = new int[2];
		int max = -1;
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] + arr[j] == 18 ) {
					int product = arr[i] * arr[j];
					
					if(arr[i] > arr[j]) {
						if(product > max) {
							res[0] = arr[i];
							res[1] = arr[j];
							max = product;
							System.out.println("MAX = " + max);
						}
					}
				}
			}
		}
		
	for(int i = 0; i < 2; i++) {
		System.out.print(res[i]+ " ");
	}
	}

}
