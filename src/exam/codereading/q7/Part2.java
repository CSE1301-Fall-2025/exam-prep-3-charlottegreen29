package exam.codereading.q7;

public class Part2 {

	public static void main(String[] args) {
		//What gets printed?
		int [] secret = new int [] { 1, 3, 1 };
		ComboLock c3 = new ComboLock (secret , 2); //C
		System.out.println (c3 ); // #0 0 0 0
		c3.trySoln(new int [] { 1, 2, 3 }); // T: 1 / 2 \n F
	}

}
