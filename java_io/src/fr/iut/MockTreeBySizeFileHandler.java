package fr.iut;

import java.io.File;

public class MockTreeBySizeFileHandler extends FileScanner {

	@Override
	public void handleRecursively(File dir, FileHandler lh) {
		lh.handleFile(new File("ok.txt"));
		lh.handleFile(new File("ok1.txt"));
		lh.handleFile(new File("ok2.txt"));
		lh.handleFile(new File("ok2.txt"));
	}
}
