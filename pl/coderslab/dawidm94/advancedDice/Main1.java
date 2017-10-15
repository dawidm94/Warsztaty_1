package pl.coderslab.dawidm94.advancedDice;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random generator = new Random();
		System.out.println("Rzuć kostką xDy+z, gdzie x - ilość kostek, y - ilość oczek, z - (opcjonalnie) ile dodać lub odjąć od wyniku");
		for(;;) {
			String diceType = scan.next();
			System.out.println(diceType);
			StringTokenizer tkn = new StringTokenizer(diceType, " D+-");
			int countTkns = tkn.countTokens();
			int dice = 0;
			if(countTkns == 1) {
				int number = Integer.parseInt(tkn.nextToken());
				dice = generator.nextInt(number)+1;
				System.out.println("Wylosowana liczba to: " + dice);
			}else if(countTkns ==3) {
				int countDices = Integer.parseInt(tkn.nextToken());
				int number = Integer.parseInt(tkn.nextToken());
				int extraNumber = Integer.parseInt(tkn.nextToken());
				for(int i=0; i<countDices; i++) {
					dice += generator.nextInt(number)+1;
				}
				if(diceType.indexOf('+')>0) {
					dice += extraNumber;
				}else {
					dice -= extraNumber;
				}
				System.out.println("Wylosowana liczba to: " + dice);
			} else if(countTkns ==2) {
				if(diceType.indexOf('D')==0) {
					int number = Integer.parseInt(tkn.nextToken());
					int extraNumber = Integer.parseInt(tkn.nextToken());
					dice += generator.nextInt(number)+1;
					if(diceType.indexOf('+')>0) {
						dice += extraNumber;
					}else {
						dice -= extraNumber;
					}
					System.out.println("Wylosowana liczba to: " + dice);
				}else {
					int countDices = Integer.parseInt(tkn.nextToken());
					int number = Integer.parseInt(tkn.nextToken());
					for(int i=0; i<countDices; i++) {
						dice += generator.nextInt(number)+1;
					}
					System.out.println("Wylosowana liczba to: " + dice);
				}
			} else {
				System.out.println("Nieprawidłowa kostka. Wprowadź ponownie.");
			}

		
		}

	}

}
