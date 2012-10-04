package fr.iut;

import java.io.File;

public class MockFileScanner extends FileScanner {

	@Override
	public void handleRecursively(File dir, FileHandler lh) {
		// TODO Auto-generated method stub
		lh.handleFile(new File("ok.txt"));
		lh.handleFile(new File("ok.txt"));
		lh.handleFile(new File("ok.txt"));
		lh.handleFile(new File("ok.txt"));
	}

}
