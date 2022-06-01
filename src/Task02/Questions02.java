package Task02;

import java.util.Scanner;

public class Questions02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3;
		
		Scanner inp=new Scanner(System.in);
		String [][]country = {
				
				{"Afghanistan", "USA", "Turkey"},
				{"Kabul", "Washington", "Istanbul"}
		};
		for (int row=0; row<country.length; row++) {
			for (int col=0; col<country[row].length; col++) {
				System.out.println(country[row][col]+" ");
			}
			System.out.println();
		}


}
	
}
