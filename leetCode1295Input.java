package learningApp;
import java.util.ArrayList;

public class leetCode1295Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int number = 0;
		int num [] = new int[] {12, 345, 2, 6, 7896};
		ArrayList<Integer> list_of_even = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			//System.out.println(num[i]);
			number = num[i];
			int count = 0;
			//System.out.println(number);
			while (number > 0) {
				number = number/10;
				//System.out.println(number);
				count = count + 1;
			}
			System.out.format("The number of digits are= %d", count);
			System.out.println(" ");
			
			if (count % 2 == 0) {
				list_of_even.add(num[i]);
				System.out.println("The number of digits are even and the number is: " + num[i]);
			} else {
				System.out.println("The number of digits are odd and the number is: " + num[i]);
			}
		}
		return list_of_even.size();
	}

}
