package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet3 {

	public static void main(String[] args) {
		int[] a = {2,3,5,1,3};
		List<Boolean> result = kids(a,3); 
		System.out.println(result);
	}
	public static List<Boolean> kids(int a[],int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		int max  = 0;
		// find maximum value in the array
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];	
				
			}
		}
		//find maximum value which is graeter than or equals to max
		for (int i = 0; i < a.length; i++) {
			if (a[i] + extraCandies >= max) {
				result.add(true);
			}else {
				result.add(false);
			}
		}
		return result;
	}

}
