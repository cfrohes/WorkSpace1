package my;

public class TowerOfHanoi {   
	//(2^n)-1 ==NUMBER OF STEPS IT TAKES TO REACH  FROM SOURCE TO DESTINATION

	public static void main(String[] args) {
		int n=1;
		towerOfHanoi(n,"S","H","D");
		
	}
	public static void towerOfHanoi(int n,String src,String helper,String dest) {
		if(n == 1) {
			System.out.println("Transer Disk "+n+" from "+src+" to "+dest);
			return;
		}
		towerOfHanoi(n-1,src,dest,helper);
		System.out.println("Transer Disk "+n+" from "+src+" to "+dest);
		towerOfHanoi(n-1,helper,src,dest);
	}

}
