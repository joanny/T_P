package com.iut.crypto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CryptoTypeOne implements ICryptoOne {

	private int MIN_CHAR = 97;
	private int MAX_CHAR = 122;

	@Override
	public void encode(File source, File dest) {
		//if (!FileHelper.validate(source) || !FileHelper.validate(dest))
			//return;
		StringBuffer buffer = new StringBuffer();
		try {

			InputStream ips = new FileInputStream(source);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);

			String ligne;
		
			char c;
			FileWriter fw = new FileWriter(dest, true);
			BufferedWriter output = new BufferedWriter(fw);

			while ((ligne = br.readLine()) != null) {
				for (int j = 0; j < ligne.length(); j++) {
				
					c = ligne.charAt(j);
					if (validateCharacter(c)) {
						c = encodeChar(c);
					}	 System.out.println(c);
					buffer.append(c);
					output.write(c);
					output.flush();
					buffer.append("line separator");
				}
			}
			br.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());

		}
	}

	@Override
	public void decode(File source, File dest) {
	 //	if (!FileHelper.validate(source) || !FileHelper.validate(dest))
		//	return;
		StringBuffer buffer = new StringBuffer();
		try {

			InputStream ips = new FileInputStream(source);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);

			String ligne;
		
			char c;
			FileWriter fw = new FileWriter(dest, true);
			BufferedWriter output = new BufferedWriter(fw);

			while ((ligne = br.readLine()) != null) {
				for (int j = 0; j < ligne.length(); j++) {
					c = ligne.charAt(j);
					if (validateCharacter(c)) {
						c = decodeChar(ligne.charAt(j));
						
					}
					buffer.append(c);
					output.write(c);
					output.flush();
					
				}
				
				buffer.append("-------------line separator-------------");
				
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());

		}

	}

	@Override
	public char decodeChar(char c) {
		return (char) ((c == MIN_CHAR) ? (char) (MAX_CHAR) :c -1);
	}

	@Override
	public char encodeChar(char c) {
		return (char) ((c == MIN_CHAR) ? (char) (MAX_CHAR) : c+1);
	}

	@Override
	public boolean validateCharacter(char ch) {
		return Character.isLetter(ch);
	}

}
