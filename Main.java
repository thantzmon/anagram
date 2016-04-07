//package anagram;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int trueAnagrams;
		int falseAnagrams;
		Scanner s = new Scanner(System.in);
		System.out.println("How many letters do you want the anagram to be?");
		num = s.nextInt();
		System.out.println("How many true anagrams do you want?");
		trueAnagrams = s.nextInt();
		System.out.println("How many false anagrams do you want?");
		falseAnagrams = s.nextInt();
		//makes 1000 true anagrams then 1000 fake anagrams.
		System.out.println("TRUE ANAGRAMS:");
		for(int i = 0; i < trueAnagrams; i++){
			System.out.println(make_true_anagram(num));
		}
		System.out.println("FALSE ANAGRAMS:");
		for(int i = 0; i < falseAnagrams; i++){
			System.out.println(make_false_anagram(num));
		}

	}

	public static String make_true_anagram(int num){
		while(true){
			String anagram = "";

			/*this code is stolen from 
			 * http://stackoverflow.com/questions/2626835/is-there-functionality-to-generate-a-random-character-in-java
			 */
			Random r = new Random();

			String alphabet = "abcdefghijklmnopqrstuvwxyz";
			for (int i = 0; i < num; i++) {
				anagram += alphabet.charAt(r.nextInt(alphabet.length()));
			} // prints 50 random characters from alphabet
			if(isAnagram(anagram)){
				return anagram;
			}
		}

	}
	public static String make_false_anagram(int num){
		while(true){
			String anagram = "";

			/*this code is stolen from 
			 * http://stackoverflow.com/questions/2626835/is-there-functionality-to-generate-a-random-character-in-java
			 */
			Random r = new Random();

			String alphabet = "abcdefghijklmnopqrstuvwxyz";
			for (int i = 0; i < num; i++) {
				anagram += alphabet.charAt(r.nextInt(alphabet.length()));
			} // prints 50 random characters from alphabet
			if(!(isAnagram(anagram))){
				return anagram;
			}
		}

	}
	public static boolean isAnagram(String anagram){
		Scanner s = null;
		//makes unique id for every string through multiplying prime numbers
		BigInteger wordValue = new BigInteger("1");
		for(int i = 0; i < anagram.length(); i++){
			switch(Character.toLowerCase(anagram.charAt(i))){
			case 'a': wordValue = wordValue.multiply(BigInteger.valueOf(2));
			break;
			case 'b': wordValue = wordValue.multiply(BigInteger.valueOf(3));
			break;
			case 'c': wordValue = wordValue.multiply(BigInteger.valueOf(5));
			break;
			case 'd': wordValue = wordValue.multiply(BigInteger.valueOf(7));
			break;
			case 'e': wordValue = wordValue.multiply(BigInteger.valueOf(11));
			break;
			case 'f': wordValue = wordValue.multiply(BigInteger.valueOf(13));
			break;
			case 'g': wordValue = wordValue.multiply(BigInteger.valueOf(17));
			break;
			case 'h': wordValue = wordValue.multiply(BigInteger.valueOf(19));
			break;
			case 'i': wordValue = wordValue.multiply(BigInteger.valueOf(23));
			break;
			case 'j': wordValue = wordValue.multiply(BigInteger.valueOf(29));
			break;
			case 'k': wordValue = wordValue.multiply(BigInteger.valueOf(31));
			break;
			case 'l': wordValue = wordValue.multiply(BigInteger.valueOf(37));
			break;
			case 'm': wordValue = wordValue.multiply(BigInteger.valueOf(41));
			break;
			case 'n': wordValue = wordValue.multiply(BigInteger.valueOf(43));
			break;
			case 'o': wordValue = wordValue.multiply(BigInteger.valueOf(47));
			break;
			case 'p': wordValue = wordValue.multiply(BigInteger.valueOf(53));
			break;
			case 'q': wordValue = wordValue.multiply(BigInteger.valueOf(59));
			break;
			case 'r': wordValue = wordValue.multiply(BigInteger.valueOf(61));
			break;
			case 's': wordValue = wordValue.multiply(BigInteger.valueOf(67));
			break;
			case 't': wordValue = wordValue.multiply(BigInteger.valueOf(71));
			break;
			case 'u': wordValue = wordValue.multiply(BigInteger.valueOf(73));
			break;
			case 'v': wordValue = wordValue.multiply(BigInteger.valueOf(79));
			break;
			case 'w': wordValue = wordValue.multiply(BigInteger.valueOf(83));
			break;
			case 'x': wordValue = wordValue.multiply(BigInteger.valueOf(89));
			break;
			case 'y': wordValue = wordValue.multiply(BigInteger.valueOf(97));
			break;
			case 'z': wordValue = wordValue.multiply(BigInteger.valueOf(101));
			break;
			}
		}
		//opens scanner to read dictionary
		File words = new File("words.txt");
		try {
			s = new Scanner(words);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//gives every single word a unique id
		while(s.hasNext()){
			String temp = s.nextLine();
			BigInteger tempValue = new BigInteger("1");
			for(int i = 0; i < temp.length(); i++){
				switch(Character.toLowerCase(temp.charAt(i))){
				case 'a': tempValue = tempValue.multiply(BigInteger.valueOf(2));
				break;
				case 'b': tempValue = tempValue.multiply(BigInteger.valueOf(3));
				break;
				case 'c': tempValue = tempValue.multiply(BigInteger.valueOf(5));
				break;
				case 'd': tempValue = tempValue.multiply(BigInteger.valueOf(7));
				break;
				case 'e': tempValue = tempValue.multiply(BigInteger.valueOf(11));
				break;
				case 'f': tempValue = tempValue.multiply(BigInteger.valueOf(13));
				break;
				case 'g': tempValue = tempValue.multiply(BigInteger.valueOf(17));
				break;
				case 'h': tempValue = tempValue.multiply(BigInteger.valueOf(19));
				break;
				case 'i': tempValue = tempValue.multiply(BigInteger.valueOf(23));
				break;
				case 'j': tempValue = tempValue.multiply(BigInteger.valueOf(29));
				break;
				case 'k': tempValue = tempValue.multiply(BigInteger.valueOf(31));
				break;
				case 'l': tempValue = tempValue.multiply(BigInteger.valueOf(37));
				break;
				case 'm': tempValue = tempValue.multiply(BigInteger.valueOf(41));
				break;
				case 'n': tempValue = tempValue.multiply(BigInteger.valueOf(43));
				break;
				case 'o': tempValue = tempValue.multiply(BigInteger.valueOf(47));
				break;
				case 'p': tempValue = tempValue.multiply(BigInteger.valueOf(53));
				break;
				case 'q': tempValue = tempValue.multiply(BigInteger.valueOf(59));
				break;
				case 'r': tempValue = tempValue.multiply(BigInteger.valueOf(61));
				break;
				case 's': tempValue = tempValue.multiply(BigInteger.valueOf(67));
				break;
				case 't': tempValue = tempValue.multiply(BigInteger.valueOf(71));
				break;
				case 'u': tempValue = tempValue.multiply(BigInteger.valueOf(73));
				break;
				case 'v': tempValue = tempValue.multiply(BigInteger.valueOf(79));
				break;
				case 'w': tempValue = tempValue.multiply(BigInteger.valueOf(83));
				break;
				case 'x': tempValue = tempValue.multiply(BigInteger.valueOf(89));
				break;
				case 'y': tempValue = tempValue.multiply(BigInteger.valueOf(97));
				break;
				case 'z': tempValue = tempValue.multiply(BigInteger.valueOf(101));
				break;
				}
			}
			//if the unique id for a word in the dictionary matches the word inputted into the function, it returns true
			if(wordValue.equals(tempValue)){
				//System.out.println(anagram + " is an anagram for " + temp);
				return true;
			}
		}
		return false;
	}


}
