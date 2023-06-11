package week6;

import java.util.ArrayList;
import java.util.List;

public class DebuggingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<String>();
		addNames(names);
		int index = findIndexOfName(names, "Tommy");
		System.out.println(index);
		
		
	}

	private static int findIndexOfName(List<String> names, String name) {
		// TODO Auto-generated method stub
		int index = -1;
		for (int i = 1; i <names.size(); i++) {
			if (names.get(i).equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	private static void addNames(List<String> names) {
		names.add("Sam");
		names.add("Tommy");
		names.add("Hilary");
		names.add("Joan");
		
	}
	
	
}
