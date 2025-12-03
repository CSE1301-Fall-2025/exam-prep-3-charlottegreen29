package exam.codereading.q7;

public class Part3 {

	public static void main(String[] args) {
		//What gets printed?
		int [] secret = new int [] { 1, 3, 1 }; /// !!! Note !!! check for print statements in constructors and toStrings!
		ComboLock c5 = new ComboLock (secret , 0); //C
		c5.trySoln(new int [] { 1, 3, 1 }); // T: 1 / 0 \n X
		System.out.println(c5); //#1 1 3 1
	}

}
