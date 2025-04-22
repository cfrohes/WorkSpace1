package my;

public class Acc01 {
	
	//https://youtu.be/SPVsr5KCdIM?si=h8AOxLDvGALz8YOE
	
	
	
//	public static void main(String[] args) {
//		int count = 0;
//		String str = "Hello Worlld";
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == ' ') {
//				continue;
//			}
//			else {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
	
//	public static void main(String[] args) {
//		
//		int[] nums = {2, 0, 1, 3};
//		int n = nums.length;
//		int total = (n *(n + 1))/2;
//		int sum = 0;
//		for(int i = 0; i < n; i++) {
//			sum += nums[i];
//			 
//		}
//		System.out.println(total - sum);
//	}
	
//	public static void main(String[] args) {
//		int n = 4;
//		int m = 20;
//		int divisibleSum = 0;
//		int notDivisibleSum = 0;
//		
//		for(int i = 1; i <= m; i++) {
//			if(i % n == 0) {
//				divisibleSum += i;
//			}
//			else {
//				notDivisibleSum += i;
//			}
//		}
//		
//			System.out.println(Math.abs(divisibleSum - notDivisibleSum));
//		
//	}
	
	
//	public static void main(String[] args) {
//		int n = 5;
//		int first = 0 , second = 1;
//		for(int i = 2; i <= n; i++) {
//			int next = first + second;
//			first = second;
//			second = next;
//		}
//		System.out.println(second);
//	}

	
//	You are given a Prime Function You need to print Whether this number
//	is Prime Number or not .
//	Input : N=2
//	Output : True
	
//	public static void main(String[] args) {
//		int n = 4;
//		System.out.println(isPrime(n));
//		
//		}
//	public static boolean isPrime(int n) {
//		if(n <= 1)
//			return false;
//		for(int i = 2; i <= Math.sqrt(n); i++) {
//			if(n % i == 0) {
//				return false;
//			}
//	}
//		return true;
//}
	
	
	
//	Given an array, write a program to find the sum of values of even and
//	odd index positions separately.
//	Input : arr = {1, 2, 3, 4,5, 6}
//	Output :Even index positions sum 9
//	Odd index positions sum 12
	
//	public static void main(String[] args) {
//		int evenSum = 0;
//		int oddSum = 0;
//		int arr[] = {1, 2, 3, 4, 5, 6};
//		for(int i = 0; i < arr.length; i++  ) {
//			if(i % 2 == 0) {
//				evenSum += arr[i];
//				
//			}
//			else {
//				oddSum += arr[i];
//			}
//		}
//		System.out.println("Even index positions sum: " + evenSum);
//		System.out.println("Odd index positions sum: " + oddSum);
//	}
	
	
//	Given a string s consisting of words and spaces, return the length of the
//			last word in the string.
//			Input: s = "Hello World"
//			Output: 5
//	public static void main(String[] args) {
//		String s = " habibi Come to dubai and dinkchank ";
//		String x = s.trim();
//		int count = 0;
//		for(int i = 0; i < x.length(); i++) {
//			if(x.charAt(i) == ' ') {
//				count = 0;
//			}else {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
	
	
//	Given an integer array nums, find the subarray with the largest sum,
//	and return its sum. KADANE'S ALGORITHM
//	Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//	Output: 6
	
//	public static void main(String[] args) {
//		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
//		int max = 0;//Integer.MIN_VALUE;
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//			max = Math.max(max, sum);
//			if(sum < 0) {
//				sum = 0;
//			}
//		}
//		System.out.println(max);
//	}
	
	public static void main(String[] args) {
		Boolean bool = true;
		if(bool = false) {
		System.out.println("Ganesh");
		}else if(bool){
		System.out.println("Laxman");
		}
		else if(!bool){
		System.out.println("Ganesh G");
		}
		else{
		System.out.println("Laxman m");
		}


		 
	}
	}

