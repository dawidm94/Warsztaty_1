package pl.coderslab.dawidm94.gameGuessNumber2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("Pomyśl liczbę od 0 do 1000 a ja ją zgadnę w max. 10 próbach");
		int min=0, max=1000, guess=0, userNumber=max+1, count=0;
		Scanner scan = new Scanner(System.in);
		while(guess!=userNumber) {
			guess=((max-min)/2)+min;
			System.out.println("Zgaduję: " + guess);
			System.out.println("Napisz proszę: \"za dużo\", \"za mało\", \"zgadłeś\"");
			String command = scan.nextLine();
			if(command.contentEquals("zgadłeś")){
				userNumber=guess;
				System.out.println("Wygrałem! Udało mi się odgadnąć liczbę \"" + userNumber + "\" w " + count + " próbach :-)");
			} else if(command.equals("za dużo")) {
				max = guess;
				count++;
			} else if(command.equals("za mało")) {
				min = guess;
				count++;
			} else {
				System.out.println("Nie oszukuj!");
			}
		}
	}

}
