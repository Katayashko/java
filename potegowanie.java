import java.util.Scanner;
public class potegowanie {

	public static void main(String[] args) {	
		// czy umiesz potegowac
		System.out.println("Wpisz ilosc wprowadzanych liczb(do 10): ");
		Scanner input = new Scanner(System.in);
		int quantity = input.nextInt();
		int[] numbers;
		numbers = new int[10];
		int[] potega;
		potega = new int[10];
		int temp;
		
		for (int i = 0; i < quantity; i++) {
			numbers[i]= input.nextInt();
			potega[i]= input.nextInt();
		}
		
		for (int i = 0; i < quantity; i++) {
			temp = numbers[i];
			for (int j = 1; j < potega[i]; j++) {
				numbers[i] = temp * numbers[i];
			}
			System.out.println(numbers[i]);
		}
		
		
		
	}

}
