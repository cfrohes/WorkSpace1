package leet;
//Given an integer array nums, return an array answer such that answer[i] is equal
//to the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) 
//time and without using the division operation.
//Example 1:
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
//.......................///...........................................................
//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//        int l = nums.length;
//        int result[] = new int[l];
//        result[0] = 1;
//        for(int i = 1; i < l; i++) {  // Input: nums = [1,2,3,4]
//            result[i] = result[i-1] * nums[i-1];
//        } 
//        int rightSide = 1;
//        for(int i = l-1; i >= 0; i--) {
//            result[i] = result[i] * rightSide;
//             rightSide *= nums[i];
//        }  
//        return result; 
//    }
//}
//.......................................................................................
public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] s = {};
		for(int i = 0 ;i < a.length; i++) {
			int m = 1;
			for (int j = 0 ; j < a.length; j++) {
				
				if (a[i] == a[j]) {
					continue;
				}else {
					m *= a[j];
				}
			
			}
			System.out.print(m);
			if (i < a.length-1) {
				System.out.print(",");
			}
			
		}
		
	
}
}
