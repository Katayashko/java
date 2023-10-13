import java.util.Scanner;

public class znaczace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Wpisz ilosc zestawow grup: ");
		int repeat = input.nextInt();
		boolean modulo;
		
		int[] group1;
		group1 = new int[repeat];
		int[] group2;
		group2 = new int[repeat];
		for (int i = 0; i < repeat; i++) {
			
			System.out.println("Wpisz ilosc przedszkolakow grupy 1: ");
			group1[i] = input.nextInt();
		}
		for (int j = 0; j < repeat; j++) {
			System.out.println("Wpisz ilosc przedszkolakow grupy 2: ");
			group2[j] = input.nextInt();
		}
		
		for (int l = 0; l < repeat; l++) {
			System.out.println("NWW zestawu nr " + l + ": " + ((group1[l] * group2[l]) / nwd(group1[l], group2[l])));
		

	}

}
