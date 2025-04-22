package leet;
// input is given in binary array you have to print decimal value of it with the condition that is it increasing,decreasing
// or stable or  ustable
public class Humanitocs3 {

	public static void main(String[] args) {
		String[] input = {"1010","1010","1010","1010"};
		Tolution s = new Tolution();
		String[] output = s.deci(input);
		System.out.println(java.util.Arrays.toString(output));
		
	
	}

}
class Tolution {
	public static String[] deci(String[] input) {
		int l = input.length;
		String[] result = new String[l];
		for (int i = 0; i < l; i++) {
			if(!(input[i].matches("[01]+"))) {
				return new String[] {"Invalid Input."};	
			}
			int decimal = Integer.parseInt(input[i],2);
			result[i] = Integer.toString(decimal);
		}
		//return result;
//		String sequenceType = "Stable";
		boolean isIncreasing = true;
		boolean isDecreasing = true;
		for ( int i = 1; i < l; i++) {
			int current = Integer.parseInt(input[i]);
			int previous = Integer.parseInt(input[i-1]);
			if (current < previous) {
				isIncreasing = false;
			}else if (current > previous) {
				isDecreasing = false;
			}
		}
		String sequenceType;
		if (isIncreasing && !isDecreasing) {
			sequenceType = "Increasing";
		}else if (!isIncreasing && isDecreasing) {
			sequenceType = "decreasing";
		}else if (isIncreasing && isDecreasing) {
			sequenceType = "Stable";
		}
		else {
			sequenceType = "Un-Stable";
		}
		String[] finalOutput = new String[l+1];
		System.arraycopy(result,0,finalOutput,0,l);
		finalOutput[l] =  sequenceType;
		return finalOutput;
		
		
	}
}
