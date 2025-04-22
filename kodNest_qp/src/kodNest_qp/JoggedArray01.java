package kodNest_qp;

public class JoggedArray01 {
	public static void main(String[] args) {

//	int[][] jaggedArray = new int [3][];
//	jaggedArray[0] = new int[2];
//	jaggedArray[1] = new int[3]; // Second row with 3 columns
//	jaggedArray[2] = new int[1]; // Third row with 1 column
	//------------------------------------------------------
//	jaggedArray[0][0] = 21;
//	jaggedArray[0][1] = 23;
//	jaggedArray[1][0] = 52;
//	jaggedArray[1][1] = 4;
//	jaggedArray[1][2] = 2;
//	jaggedArray[2][0] = 3;
	
	//------------------------------------------------------------
	
	int jaggedArray[][] = {{21, 23}, {23, 45, 56}, {4}}; 
	
	System.out.println("Jagged Array:");
    for(int i = 0; i < jaggedArray.length; i++) {
        for(int j = 0; j < jaggedArray[i].length; j++) {
            System.out.print(jaggedArray[i][j] + " ");
        }
        System.out.println();
    }
	
}
}
