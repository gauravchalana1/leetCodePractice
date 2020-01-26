package learningApp;

public class rightStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, z;
		int n = 5;
		for (i = 0; i <= n; i++) {
			for(j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(z = 0; z <= j; z++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
