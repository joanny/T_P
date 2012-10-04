package com.iut.crypto;

import java.io.File;

public interface ICrypto {
	/**
	 * Encode le fichier de la source selon un algorithme sp�cifique
	 * 
	 * @param source
	 * @param dest
	 */
	public void encode(File source, File dest);

	/**
	 * Decode le fichier de la source selon un algorithme sp�cifique
	 * 
	 * @param source
	 * @param dest
	 */
	public void decode(File source, File dest);
}
