package exam.codereading.q3;

import java.util.LinkedList;

public class Part1 {

	public static void main(String[] args) {
		//What will print?
		LinkedList<Integer> items = new LinkedList<>(); // !!! Note !!! remember that lists and maps must contain objects and not primative data types!
		items.add (4);
		items.add (9);
		for ( int i = 0; i < 4; i ++) {
			int term1 = 7 % items.size();
			int term2 = items.get(i);
			items.add(term1 + term2 );
		}
		for (int i = 0; i < items.size(); i ++) {
			System.out.println (items.get(i)); // 4 9 5 10 8 12 (but one each line)
		}
	}
}
