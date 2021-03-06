package _02_File_Encrypt_Decrypt;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */

	char[] before= {'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D'};
	char[] after= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

	public static void main(String[] args) {
		try{
		BufferedReader br= new BufferedReader(new FileReader(src/_02_File_Encrypt_Decrypt/message));
		String encrypted= br.readLine();
		br.close();
		char[] chars= new FileDecryptor().decrypt(encrypted);
		String message= new String(chars);
			JOptionPane.showMessageDialog(null, message);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		} catch(IOException e) {
			e.printStackTrace();

	}

	char[] decrypt(String input){
		char[] chars= input.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < before.length; j++) {
				if(chars[i] == before[j]){
					chars[i] = after[j];
					break;
				}
			}
		}
		return chars;
	}
}
