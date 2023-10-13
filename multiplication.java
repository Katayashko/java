import java.util.Scanner;
public class multiplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Wpisz ilosc zestawow: ");
		int repeat = input.nextInt();
		
		int[] array1;
		array1 = new int[repeat];
		int[] array2;
		array2 = new int[repeat];

		for(int i = 0; i < repeat; i++) {
			System.out.println("Wpisz pierwsza liczbe: ");
			array1[i] = input.nextInt();
			System.out.println("Wpisz druga liczbe: ");
			array2[i] = input.nextInt();
		}
		for(int i = 0; i < repeat; i++) {
			System.out.println(array1[i] * array2[i]);
		}
	}

}
