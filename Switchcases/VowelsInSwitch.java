package switchPack;

import java.util.Scanner;

public class VowelsInSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char letter;
		System.out.println("Enter the letter you want:");
			letter = sc.next().charAt(0);
			switch(letter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(letter+ " is an Vowel");
				break;
			default:
				System.out.println(letter+ " is not a Vowel");
			}
	}

}
