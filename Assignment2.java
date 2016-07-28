/**
 * 
 */
package sdh.java.session7;

import java.util.Scanner;

/**
 * @author Sudhish
 * 
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int arraySize = Integer.parseInt(in.nextLine());
		int[] elements = new int[arraySize];
		try {
			System.out.println("Enter all the elements: ");
			for (int i = 0; i < elements.length; i++) {
				elements[i] = Integer.parseInt(in.nextLine());
			}
			System.out.println("Entered array is : ");
			for (int i = 0; i < elements.length; i++) {
				System.out.println(elements[i] + "\t");
			}
		} catch (NumberFormatException e) {
			System.out
					.println("Exception is handled:::All the elements must be Integer : "
							+ e);
		}

	}

}
