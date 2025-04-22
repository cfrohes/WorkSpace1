package my;

import java.util.Stack;

public class Encapsulation_Example {
	public static void printReverse(Stack <Integer> s,int data ) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		printReverse(s,data);
		s.push(top);
	}
		public static void main(String[] args) {
			Stack<Integer> s = new Stack<>();
			
			s.push(1);
			s.push(2);
			s.push(3);
			reverse(s);
			while(!s.isEmpty()) {
				System.out.println(s.peek());
				s.pop();
			}
			
		}
		private static void reverse(Stack<Integer> s) {
			// TODO Auto-generated method stub
			
		}
	
			 }
			 

	


