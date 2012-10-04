package fr.iut;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListFileHandler implements FileHandler {

	private List<File> listFile;

	public ListFileHandler() {
		super();
		this.listFile = new ArrayList<File>();
	}

	public List<File> getResultList() {
		return listFile;
	}

	@Override
	public void handleFile(File file) {
		this.listFile.add(file);
	}

}
