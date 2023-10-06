import java.util.Scanner;
public class pierwsze {

	public static void main(String[] args) {
		System.out.println("Wpisz ilosc wprowadzanych liczb(do 10): ");
		Scanner input = new Scanner(System.in);
		int quantity = input.nextInt();
		int[] numbers;
		numbers = new int[10];
		int[] truefalse;
		truefalse = new int[10];
		
		for (int i = 0; i < quantity; i++) {
			numbers[i]= input.nextInt();
		}
		
		for (int i = 0; i < quantity; i++) {
			for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
				if (numbers[i] % j == 0) {
						truefalse[i] = 0;
				} else {
					truefalse[i] = 1;}
			}
			if (truefalse[i] == 1) {
				System.out.println(numbers[i] + " jest pierwsza");
			} else {
				System.out.println(numbers[i] + " nie jest pierwsza");
			}
		}
		
		
		
		
		
		
		
	}

}