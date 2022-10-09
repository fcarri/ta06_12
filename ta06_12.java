package project6;

import java.util.Random;
import java.util.Scanner;

public class ta06_12 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamany array: ");
		int tamany = sc.nextInt();
		
		int array[] = new int[tamany];
		int arrayDigit[] = {0,1,2,3,4,5,6,7,8,9};
								
									
		System.out.println("Digit: ");
		int digit = sc.nextInt();
					
		
		for (int k = 0; k <= 9; k++) {
			
			if (arrayDigit[k] == digit) {
				aleat(tamany, array, digit);
			}
		}
		
						
		sc.close();
	}
	
	public static void aleat(int tamany, int array[], int digit) {
		
		Random rand = new Random(); 						
		
		for(int k = 0; k < tamany; k++) {
			int rand1 = rand.nextInt(300) + 1;
			array[k] = rand1; 
			if (array[k] % 10 == digit) {
				System.out.println(array[k]);
			}
		}
	}
	
	
}
