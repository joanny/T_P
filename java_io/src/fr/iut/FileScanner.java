package fr.iut;

import java.io.File;

public class FileScanner {

	public void handleRecursively(File dir, FileHandler lh) {
		for (int i = 0; i < dir.listFiles().length; i++) {

			if (dir.listFiles()[i].isDirectory()) {
				handleRecursively(dir.listFiles()[i], lh);
				lh.handleFile(dir.listFiles()[i]);
			}
			if (dir.listFiles()[i].isFile()) {
				lh.handleFile(dir.listFiles()[i]);

			}
		}
	}
}
