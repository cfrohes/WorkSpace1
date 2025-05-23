package leet;
//planted in adjacent plots.
//
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
//return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false 
//		otherwise.

//Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//
//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false

public class Leet4 {

	public static void main(String[] args) {
		int arr[] = {1,0,0,0,0,0,1};
		Solution s = new Solution();
		boolean result = s.flower(arr,2);
		System.out.println(result);

	}

}
class Solution {
	public boolean flower(int []a,int n) {
		int count = 0;
		int l = a.length;
		for (int i = 0; i < l; i++) {
			if (a[i] == 0 && 
					(i==0 || a[i-1]==0) && (i==l-1 || a[i+1]==0))  {
				count ++;
				a[i] = 1;
			}
		}
		return count >= n;
	}
}
