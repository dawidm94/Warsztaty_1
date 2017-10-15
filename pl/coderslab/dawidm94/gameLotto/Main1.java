package pl.coderslab.dawidm94.gameLotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int howManyNumber = 6;	
		int countGoodType = 0;
		int [] myNumbers = new int [howManyNumber];
		int [] lottoNumbers = new int [howManyNumber];

//		System.out.println(Arrays.toString(lottoNumbers));
		
		/** Wprowadzenie liczb przez użytkownika **/
		
		System.out.println("Wytypuj liczby lotto:");
		for (int i=0;i<howManyNumber;i++) {
			System.out.println("Podaj " + (i+1) + " liczbę:");
			int typeNumber = scan.nextInt();
			
		/** Sprawdzenie czy liczba pasuje do zakresu**/
			
			while(typeNumber<1||typeNumber>49) {
				System.out.println("Podano inną liczbę niż z przedziału 1-49. Podaj jeszcze raz " + (i+1) + " liczbę");
				typeNumber = scan.nextInt();
			}
		/** Sprawdzanie czy liczba już była wcześniej podana **/
			
			int ifWasNumber = 0;
			for(int j=0; j<howManyNumber; j++) {
				if(typeNumber==myNumbers[j]) {
					ifWasNumber++;
				}
			}
			while(ifWasNumber>0) {
				ifWasNumber=0;
				System.out.println("Podano już taką cyfrę! Podaj jeszcze raz " + (i+1) + " liczbę" );
				typeNumber = scan.nextInt();
				for(int k=0; k<howManyNumber; k++) {
					if(myNumbers[k]==typeNumber) {
						ifWasNumber++;
					}
				}
			}
			myNumbers[i] = typeNumber;			
		}
		
		/** Wylosowanie liczb lotto **/
		
		Integer[] arr = new Integer[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		Collections.shuffle(Arrays.asList(arr));
//		System.out.println(Arrays.toString(arr));
		for (int i=0; i<howManyNumber;i++) {
			lottoNumbers[i]=arr[i];
		}
		
		/** Sprawdzanie liczb podanych z liczbami losowymi lotto**/	
		
		System.out.println("Twoje wytypowane liczby to: " + Arrays.toString(myNumbers));
		for (int i=0;i<myNumbers.length;i++) {
			for(int j=0; j<myNumbers.length;j++) {
				if(myNumbers[j]==lottoNumbers[i]) {
					countGoodType++;
				}
			}
		}
		/** Komunikat o wyniku**/
		System.out.println("Dzisiejsze wylosowane liczby lotto to: " + Arrays.toString(lottoNumbers));
		if(countGoodType==0) {
			System.out.println("Niestety, nie udało Ci się trafić żadnej cyfry. :(");
		}else if(countGoodType==1) {
			System.out.println("Dzisiaj tylko jedynka. Spróbuj następnym razem :)");
		}else if(countGoodType==2) {
			System.out.println("Dzisiaj dwójka. Spróbuj następnym razem :)");
		}else if(countGoodType==3) {
			System.out.println("BRAWO! Wytypowałeś trójkę! Mała wygrana ale zawsze cieszy!");
		}else if(countGoodType==4) {
			System.out.println("BRAWO! Wytypowałeś czwórkę! Gratulacje!!");
		}else if(countGoodType==5) {
			System.out.println("Woooow!!! Piątka!! Ogromne gratulacje!!!");
		}else {
			System.out.println("BRAWOOOOOOOO!!!!!!! SZÓSTKA!!!!!!! WYGRAŁEŚ!!!");
		}
	}

}
