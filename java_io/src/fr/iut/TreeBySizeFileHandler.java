package fr.iut;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TreeBySizeFileHandler implements FileHandler {
	
	private TreeMap<Long, List<File>> threeMap;
	public TreeBySizeFileHandler() {
		super();
		threeMap = new TreeMap<Long, List<File>>();
	}

	public List<File> getThreeMap() {
		List<File> listFile = new ArrayList<File>();
		List<File> listFileB = new ArrayList<File>();

		for (long l : this.threeMap.descendingKeySet()) {

			listFile.addAll(this.threeMap.get(l));

		}
		for (int j = 0; j < 4; j++) {
			listFileB.add(listFile.get(j));
		}

		return listFileB;
	}

	public void registerInList(TreeMap<Long, List<File>> threeMap, File file) {

		List<File> ls = threeMap.get(file.length());
		if (ls == null) {
			ls = new ArrayList<File>();
			threeMap.put(file.length(), ls);
		}
		ls.add(file);
	}

	public void setThreeMap(TreeMap<Long, List<File>> threeMap) {
		this.threeMap = threeMap;
	}

	@Override
	public void handleFile(File file) {
		this.registerInList(threeMap, file);
	}

	public List<File> compareFile() {

		List<File> listFile = new ArrayList<File>();

		for (long l : this.threeMap.descendingKeySet()) {
			listFile.add((File) this.threeMap.get(l));
		}
		return listFile;

	}

}
