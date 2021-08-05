
public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int[4][];
		 arr[0] = new int[2];
		 arr[1] = new int[8];
		 arr[2] = new int[4];
		 arr[3] = new int[6];
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 System.out.print("0 ");
			 }
			 System.out.println("");
		 }
	}

}
