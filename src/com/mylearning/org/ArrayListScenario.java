package com.mylearning.org;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListScenario {

	public static void main(String[] args) {

		/* ArrayList,Set,Map,Tree,HashSet,HashTree,HashMap,Treeset */

		ArrayList<String> al = new ArrayList();

		al.add("one");
		al.add("twentyone");
		al.add("thirtyone");
		al.add("fortyone");
		al.add("fiftyone");
		al.add("sixtyone");
		al.add("seventtyone");

		System.out.println(al);

		System.out.println(al.size());

		al.remove(0);
		al.remove(2);

		System.out.println(al);

		HashMap<String, Integer> hm = new HashMap();
		hm.put("one", 1);
		hm.put("two", 12);
		hm.put("three", 13);
		hm.put("four", 1);

		System.out.println(hm.values());
		System.out.println(hm.keySet());

	}

}
