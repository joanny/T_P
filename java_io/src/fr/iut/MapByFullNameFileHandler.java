package fr.iut;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapByFullNameFileHandler implements FileHandler {

	private Map<String, List<File>> map;

	public MapByFullNameFileHandler() {
		super();
		this.map = new HashMap<String, List<File>>();
	}

	public void registerInList(Map<String, List<File>> map, File file) {

		List<File> ls = map.get(file.getName());

		if (ls == null) {
			ls = new ArrayList<File>();
			map.put(file.getName(), ls);
		}
		ls.add(file);
	}

	@Override
	public void handleFile(File file) {
		this.registerInList(map, file);
		doublons();
	}

	public Map<String, List<File>> getMap() {
		return map;
	}

	public void setMap(Map<String, List<File>> map) {
		this.map = map;
	}

	public void doublons() {

		List<File> ls;
		for (String s : this.map.keySet()) {
			ls = this.map.get(s);
			if (ls.size() > 1) {
				System.out.println("Doublons !!!" + this.map.get(s));
			}
		}
	}
}
