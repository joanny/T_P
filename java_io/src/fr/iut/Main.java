package fr.iut;

import java.io.File;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		File dir = (args.length > 0) ? new File(args[0]) : new File(".");
		TreeBySizeFileHandler lh = new TreeBySizeFileHandler();
		new MockTreeBySizeFileHandler().handleRecursively(dir, lh);

		List<File> files = lh.getThreeMap();
		System.out.println(files);
	}
}
