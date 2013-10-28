package test;

import java.util.ArrayList;

public class pjo {
	public ArrayList<String> arr = new ArrayList<String>();

	public static pjo instance;

	public static pjo getInstance() {
		if (instance == null) {
			instance = new pjo();
		}

		return instance;
	}

	public synchronized void addArr(String arg) {
		arr.add(arg);
		System.out.println("access id = " + arg + ", size = " + arr.size());
		System.out.println("github test");
	}
}