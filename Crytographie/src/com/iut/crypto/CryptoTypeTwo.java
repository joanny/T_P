package com.iut.crypto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CryptoTypeTwo implements ICryptoTwo {

	@Override
	public void encode(File source, File dest) {
		// populateTab();
		// System.out.println(encodeChar('u'));
		// if (!FileHelper.validate(source) || !FileHelper.validate(dest))
		// return;
		StringBuffer buffer = new StringBuffer();
		String ligne;
		String valeur;
		try {

			InputStream ips = new FileInputStream(source);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);

			char c;
			FileWriter fw = new FileWriter(dest, true);
			BufferedWriter output = new BufferedWriter(fw);

			while ((ligne = br.readLine()) != null) {
				for (int j = 0; j < ligne.length(); j++) {
					c = ligne.charAt(j);
					if (validateCharacter(c)) {
						valeur = encodeChar(c);
						buffer.append(valeur);
						output.write(valeur);
						output.flush();
					} else {
						buffer.append(c);
						output.write(c);
						output.flush();
					}
				}
				buffer.append("-------------line separator-------------");
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());

		}

	}

	@Override
	public void decode(File source, File dest) {
		StringBuffer buffer = new StringBuffer();
		String ligne;
		String valeur = null, valeur_decode;
		try {

			InputStream ips = new FileInputStream(source);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);

			char c;
			FileWriter fw = new FileWriter(dest, true);
			BufferedWriter output = new BufferedWriter(fw);
			int b = 1;
			char d;
			while ((ligne = br.readLine()) != null) {
				// System.out.println( ligne);
				for (int j = 0; j < ligne.length(); j++) {
					if ((j % 2) == 0) {
						c = ligne.charAt(j);
						d = ligne.charAt(b);
						// if (Numbe && Character.isLetter(d)){

						valeur = Character.toString(c);
						valeur = valeur + Character.toString(d);
						valeur_decode = decodeChar(valeur);
						System.out.println(valeur_decode);
						// }

					}

					 
					   buffer.append(valeur); 
					   output.write(valeur);
					   output.flush();
					  
					  // buffer.append(c); output.write(c); output.flush();
					  

				}
				  buffer.append("-------------line separator-------------");

				b = b + 2;
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());

		}

	}

	@Override
	public void populateTab() {

	}

	@Override
	public String encodeChar(char ch) {
		String valeur = "aaaa";
		try {

			InputStream ips = new FileInputStream(
					"C:/Users/papy/workspace/Cryptographie/src/com/iut/dev_src/pattern.txt");
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			int i = 0;
			while ((ligne = br.readLine()) != null) {
				for (int j = 0; j < ligne.length(); j++) {
					if (ch == ligne.charAt(j)) {
						valeur = i + "" + j;
					}
				}
				i++;
			}
			br.close();

		} catch (Exception e) {
			System.out.println(e.toString());

		}
		return valeur;
	}

	public int convertToInt(String letter) {
		char adr1 = letter.charAt(0);
		String adrZ = Character.toString(adr1);
		int a = Integer.parseInt(adrZ);

		return a;
	}

	public int convertToInt_two(String letter) {
		char adr1 = letter.charAt(1);
		String adrZ = Character.toString(adr1);
		int a = Integer.parseInt(adrZ);

		return a;
	}

	@Override
	public String decodeChar(String cha) {
		char valeur = 0;

		try {

			InputStream ips = new FileInputStream(
					"/home/etudiants/csid/jsimpore/travaux_pratiques/Crytographie/src/com/iut/crypto/dev_src/pattern.txt");
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			int i = 0;

			while ((ligne = br.readLine()) != null) {
				if (convertToInt(cha) == i) {
					for (int j = 0; j < ligne.length(); j++) {
						if (j == convertToInt_two(cha)) {
							valeur = ligne.charAt(j);
						}

					}
				}
				i++;
			}

			br.close();

		} catch (Exception e) {
			System.out.println(e.toString());

		}
		return Character.toString(valeur);
	}

	@Override
	public boolean validateCharacter(char ch) {
		return Character.isLetter(ch);
	}
}
