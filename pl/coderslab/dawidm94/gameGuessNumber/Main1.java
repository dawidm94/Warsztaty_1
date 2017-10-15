package pl.coderslab.dawidm94.gameGuessNumber;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		guessNumber();
	}
	public static void guessNumber() {
		
		Scanner scan = new Scanner(System.in);
    	Random generator = new Random();
    	int rightNumber = generator.nextInt(100)+1;
    	int count = 1;
		System.out.println("Zgadnij liczbę od 0 do 100: ");
			int guessNumber = scan.nextInt() ;
			while(rightNumber!=guessNumber) {
				if(guessNumber<0||guessNumber>100) {
					System.out.println("Wpisano liczbę inną niż przedział 0 do 100!");
				}else if (guessNumber<rightNumber){
					System.out.println("Za mało!");
				}
				else {
					System.out.println("Za dużo!");
				}
				count++;
				guessNumber = scan.nextInt();
			}
			System.out.println("BRAWO! ZGADŁEŚ! Szukana liczba to: " + rightNumber);
			System.out.println("Zgadłeś za " + count + " razem.");

	}


}
